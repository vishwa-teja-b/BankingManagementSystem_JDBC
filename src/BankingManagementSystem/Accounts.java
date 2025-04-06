package BankingManagementSystem;

import java.sql.*;
import java.util.Scanner;

public class Accounts {
    private Connection connection;
    private Scanner scanner;

    public Accounts(Connection connection, Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }

    public long open_account(String email){
        if(!account_exists(email)){
            String open_account_query = "INSERT INTO accounts(account_number, full_name,email,balance,security_pin) VALUES (?,?,?,?,?)";
            scanner.nextLine();
            System.out.println("Enter Full Name : ");
            String full_name = scanner.nextLine();
            System.out.println("Enter Initial Amount : ");
            double balance = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter Security Pin : ");
            String security_pin = scanner.nextLine();

            try{
                long account_number = generateAccountNumber();
                PreparedStatement preparedStatement = connection.prepareStatement(open_account_query);
                preparedStatement.setLong(1,account_number);
                preparedStatement.setString(2,full_name);
                preparedStatement.setString(3,email);
                preparedStatement.setDouble(4,balance);
                preparedStatement.setString(5,security_pin);

                int rowsAffected = preparedStatement.executeUpdate();

                if(rowsAffected > 0){
                    return account_number;
                }else{
                    throw new RuntimeException("Account Creation Failed !");
                }
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        throw new RuntimeException("Account Already Exists.");
    }

    public long getAccountNumber(String email){
        String query = "SELECT account_number FROM accounts WHERE email = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,email);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                long account_number = resultSet.getLong("account_number");
                return account_number;
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        throw new RuntimeException("Account Number Doesn't Exist!");
    }

    private long generateAccountNumber(){
        try{
            Statement statement = connection.createStatement();
            String query = "SELECT account_number FROM accounts ORDER BY account_number DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                long last_account_number = resultSet.getLong("account_number");
                return last_account_number+1;
            }else{
                return 10000100;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return 10000100;
    }

    public boolean account_exists(String email){
        String query = "SELECT account_number FROM accounts WHERE email = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
