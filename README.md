🏦 Banking Management System
Welcome to the Banking Management System! This project is designed to simulate basic banking operations, providing functionalities such as account creation, transactions, and balance inquiries.

🚀 Features
Account Management: Create and manage customer accounts.

Transactions: Perform deposits, withdrawals, and transfers.

Balance Inquiry: Check account balances in real-time.

Transaction History: View a log of all transactions for each account.

Secure Authentication: Ensure that only authorized users can access and perform operations.

🛠️ Technologies Used
Java: Core programming language.

JDBC (Java Database Connectivity): For database connectivity.

MySQL: Backend database to store account and transaction details.

📂 Project Structure
css
Copy
Edit
BankingManagementSystem_JDBC/
├── src/
│   └── BankingManagementSystem/
│       ├── Account.java
│       ├── Transaction.java
│       ├── DatabaseConnection.java
│       └── Main.java
├── .gitignore
└── BankingManagementSystem.iml
Account.java: Contains the Account class with attributes like accountNumber, accountHolderName, and balance. It includes methods for depositing and withdrawing funds.

Transaction.java: Defines the Transaction class to record transaction details such as transactionId, accountNumber, transactionType, and amount.

DatabaseConnection.java: Manages the database connection using JDBC. It includes methods to connect to and disconnect from the MySQL database.

Main.java: The entry point of the application. It provides a menu-driven interface for users to interact with the banking system.

📝 Setup Instructions
Clone the Repository:

bash
Copy
Edit
git clone https://github.com/vishwa-teja-b/BankingManagementSystem_JDBC.git
Database Configuration:

Ensure you have MySQL installed and running.

Create a database named banking_db.

Import the provided SQL script (banking_db.sql) to set up the necessary tables.

Update Database Credentials:

In DatabaseConnection.java, update the DB_URL, USER, and PASS constants with your MySQL credentials.

Compile and Run:

Navigate to the src/ directory.

Compile the Java files:

bash
Copy
Edit
javac BankingManagementSystem/*.java
Run the application:

bash
Copy
Edit
java BankingManagementSystem.Main
📸 Screenshots

Main Menu Interface


Account Creation Screen

🤝 Contributing
Contributions are welcome! Please fork this repository and submit a pull request with your enhancements.

📄 License
This project is licensed under the MIT License. See the LICENSE file for more details.

