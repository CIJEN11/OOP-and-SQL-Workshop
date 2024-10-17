OOP and SQL Workshop
This Java project demonstrates the principles of Object-Oriented Programming (OOP) in combination with SQL database interactions using JDBC (Java Database Connectivity). The program allows for CRUD (Create, Read, Update, Delete) operations on a User entity in a MySQL database, illustrating the integration between Java applications and relational databases.

Table of Contents
Overview
Technologies Used
Setup
Database Configuration
Project Configuration
Features
Running the Project
Known Issues
License
Overview
This project includes the following components:

UserDao class: Handles all database operations related to the User entity.
DbUtil class: Provides utility functions for managing database connections.
Main class: A console-based entry point to perform CRUD operations (Create, Read, Update, Delete) on users.
The program connects to a MySQL database called workshop2, where users' data is stored and manipulated through JDBC.

Technologies Used
Java 17: Core programming language.
MySQL: Database used for storing user data.
JDBC (Java Database Connectivity): For interacting with the MySQL database.
Maven: Build automation tool, used for managing dependencies.
BCrypt: For securely hashing user passwords.
Setup
Database Configuration
MySQL Installation: Ensure MySQL is installed on your system. You can download it from here.

Create the Database: In your MySQL instance, create a new database named workshop2.

sql
Copy code
CREATE DATABASE workshop2;
Create the User Table: Create the users table in the workshop2 database.

sql
Copy code
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL
);
Configure MySQL Credentials: Ensure you have the correct credentials set in the DbUtil class.

In DbUtil.java:

java
Copy code
private static String DB_URL = "jdbc:mysql://localhost:3306/workshop2";
private static String DB_USER = "root";   // Your MySQL username
private static String DB_PASS = "password";  // Your MySQL password
Project Configuration
Clone the Repository: Clone this repository to your local machine.

bash
Copy code
git clone https://github.com/your-repo/OOPandSQLWorkshop.git
Install Dependencies: Make sure Maven is installed. Use the following command to install required dependencies, including the MySQL connector and BCrypt for password hashing.

bash
Copy code
mvn clean install
MySQL JDBC Driver: Ensure the MySQL JDBC driver is added to your pom.xml file:

xml
Copy code
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.34</version>
</dependency>
Features
Create a User: Add a new user to the database with a securely hashed password.
Read a User: Retrieve and display user details from the database by ID.
Update a User: Update an existing user's information.
Delete a User: Remove a user from the database.
Running the Project
Once you have set up the database and the project, follow these steps to run the program:

Compile the Project:

bash
Copy code
mvn compile
Run the Main Class:

You can run the program from your IDE (like IntelliJ IDEA) or from the command line:

bash
Copy code
mvn exec:java -Dexec.mainClass="pl.coderslab.entity.Main"
Interact with the Program:

The Main class will present various CRUD operations to interact with the User entity stored in the MySQL database. Follow the prompts to create, read, update, or delete users.

Known Issues
SQLException: No suitable driver: If you encounter the error No suitable driver found for jdbc:mysql://localhost:3306/workshop2, make sure the MySQL JDBC driver is properly configured in your project. Check your pom.xml file and classpath settings.

Password Hashing: The BCrypt library is used to hash passwords for security. Ensure the jbcrypt dependency is correctly included in the project.

License
This project is licensed under the MIT License - see the LICENSE file for details.

This README.md covers the project's overview, setup instructions, and how to run the project. Let me know if you need further customization!






