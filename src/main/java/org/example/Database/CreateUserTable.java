package org.example.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateUserTable {
    public static void createUserTable() {
        System.out.println("fasz");
        try (Connection connection = DatabaseConnection.getConnection()) {
            if (connection != null) {
                // SQL query to create users table
                String sql = "CREATE TABLE IF NOT EXISTS users ("
                        + "Id INT PRIMARY KEY AUTO_INCREMENT, "
                        + "First_Name VARCHAR(50) NOT NULL, "
                        + "Last_Name VARCHAR(50) NOT NULL, "
                        + "Email VARCHAR(150) NOT NULL, "
                        + "Password VARCHAR(150) NOT NULL, "
                        + "Gender ENUM('male', 'female'), "
                        + "Birthday DATE, "
                        + "Height FLOAT, "
                        + "Weight FLOAT, "
                        + "Fitness_Goal ENUM('Fat_Loss',' Weight_Gain')"
                        + ");";
                // Attempt of creating the table
                try (Statement statement = connection.createStatement()) {
                    statement.executeUpdate(sql);
                    System.out.println("Table created!");
                }
            }
        } catch (SQLException e) {
            System.out.println("Failed to create table");
            e.printStackTrace();
        }
    }
}

