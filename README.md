# 🏦 Banking Management System

Welcome to the **Banking Management System**! This project simulates basic banking operations such as account creation, transactions, and balance inquiries using Java and JDBC.

---

## 🚀 Features

- ✉️ **Account Management**: Create and manage customer accounts.
- 💳 **Transactions**: Deposit, withdraw, and transfer funds.
- 💸 **Balance Inquiry**: Check real-time balances.
- 🔢 **Transaction History**: Track all past transactions.
- 🔒 **Authentication**: Secured access for account operations.

---

## 🛠️ Technologies Used

- **Java**
- **JDBC (Java Database Connectivity)**
- **MySQL**

---

## 📂 Project Structure

```
BankingManagementSystem_JDBC/
├── src/
│   └── BankingManagementSystem/
│       ├── Account.java
│       ├── Transaction.java
│       ├── DatabaseConnection.java
│       └── Main.java
├── .gitignore
└── BankingManagementSystem.iml
```

---

## 📃 Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/vishwa-teja-b/BankingManagementSystem_JDBC.git
```

### 2. Configure the Database
- Make sure MySQL is installed and running.
- Create a database named `banking_db`.
- Import any SQL setup script if provided (like `banking_db.sql`).

### 3. Update Database Credentials
In `DatabaseConnection.java`, update:
```java
DB_URL = "jdbc:mysql://localhost:3306/banking_db";
USER = "your_mysql_user";
PASS = "your_mysql_password";
```

### 4. Compile and Run the Application
```bash
cd src
javac BankingManagementSystem/*.java
java BankingManagementSystem.Main
```

---

## 🖼️ Screenshots
![image](https://github.com/user-attachments/assets/9bc5f31d-d78a-43a9-bd19-8bbb4035fdec)
![image](https://github.com/user-attachments/assets/680947e3-8ed4-4d50-9472-9a40746c2958)




---

## 👥 Contributing

Contributions are welcome! Feel free to fork this repo and submit a pull request 🚀

---

## 📄 License

This project is licensed under the **MIT License**. See the `LICENSE` file for more information.

---

**Happy Coding!** ✨

