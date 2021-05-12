package com.ahelord.jdbctest;

import utils.ConnectionSQL;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {


        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5433/booklickdb-dev-content?currentSchema=public";
            // connect mac
            //            String url = "jdbc:postgresql://localhost:5432/booklickdb-dev-content?currentSchema=public";

            Properties props = new Properties();
            // connect mac
            //props.setProperty("user","adminchecklemon");
            // props.setProperty("password","fitpal");

            props.setProperty("user", "booklickdb");
            props.setProperty("password", "b00kl1ck2017");

            Connection connection = null;
            connection = DriverManager.getConnection(url, props);
            ConnectionSQL connectionSQL = new ConnectionSQL();
            Connection connectionWithUtil = connectionSQL.getConnection();


            UserRepository userRepository = new UserRepository();
            for (User user : userRepository.findAll()) {
                System.out.println(user.toString());
            }
            User user = new User("jshelby@example.co");
            System.out.println("is inserted "+userRepository.inserted(user));


            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver");

            System.out.println("Connected to PostgreSQL database!");
            Statement statementSelectUsers = connection.createStatement();
            Statement statementUpdate = connection.createStatement();

            System.out.println("Reading user records...");
            ResultSet resultSet = statementSelectUsers.executeQuery("SELECT * FROM public.user");
            int resultSetTwo = statementUpdate.executeUpdate("UPDATE public.booklist SET \"isPublic\"=true");
            //System.out.println("row affected "+resultSetTwo);

            while (resultSet.next()) {
                //System.out.println( resultSet.getString("email"));
            }
            statementSelectUsers.close();
            statementUpdate.close();
            resultSet.close();
            connection.close();

        } /*catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found.");
            e.printStackTrace();
        }*/ catch (SQLException | IOException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}


