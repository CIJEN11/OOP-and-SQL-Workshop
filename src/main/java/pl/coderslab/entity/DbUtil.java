package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2";
    private static final String DB_USER = "root"; // Change to your DB user
    private static final String DB_PASS = "coderslab"; // Change to your DB password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}
