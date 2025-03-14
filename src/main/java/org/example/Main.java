package org.example;

import org.example.Database.DatabaseConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            System.out.println("Connected to MySQL!");
            DatabaseConnection.closeConnection(connection);
        } else {
            System.out.println("Failed to connect/:(");
        }
    }
}