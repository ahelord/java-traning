package com.ahelord.jdbctest;

import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5433/booklickdb-dev-content?currentSchema=public";
            Properties props = new Properties();
            props.setProperty("user","booklickdb");
            props.setProperty("password","b00kl1ck2017");
            Connection connection = null;
            connection = DriverManager.getConnection(url, props);


            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver");

            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            System.out.println("Reading user records...");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.user");
            while (resultSet.next()) {
                System.out.println( resultSet.getString("email"));
            }

        } /*catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found.");
            e.printStackTrace();
        }*/ catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
    }


