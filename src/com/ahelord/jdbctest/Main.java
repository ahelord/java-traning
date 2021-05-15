package com.ahelord.jdbctest;

import utils.ConnectionSQL;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {


        try {

            // Connection with repository without transaction
            UserRepository userRepository = new UserRepository();
            for (User user : userRepository.findAll()) {
                System.out.println(user.toString());
            }
            User user = new User("jshelby2@example.co");
            System.out.println("is inserted " + userRepository.inserted(user));
            System.out.println("is updated " + userRepository.updated("jshelby2@example.co", "jshelby2@example.co"));
            System.out.println("is deleted " + userRepository.deleted("jshelby2@example.co"));


            // connection with repository and transaction START
            ConnectionSQL transactionConnection = new ConnectionSQL();
            try {

                transactionConnection.getConnection().setAutoCommit(false);
                System.out.println("autocommit  " + transactionConnection.getConnection().getAutoCommit());
                UserRepository userRepositoryTwo = new UserRepository(transactionConnection.getConnection());
                userRepositoryTwo.inserted(new User("ashelby@example.com"));
                userRepositoryTwo.updated("ashelby@example.com", "ashelby@example.com");
                userRepositoryTwo.deleted("ashelby@example.com");
                transactionConnection.getConnection().commit();

            } catch (SQLException e) {
                System.out.println("Rollback");
                e.printStackTrace(System.out);
                transactionConnection.getConnection().rollback();
            }


            // connection with repository and transaction END


            // Connection without Repository START
            Class.forName("org.postgresql.Driver");
            InputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/aplication.properties");
            Properties props = new Properties();
            props.load(input);

            // connect mac
            //            String url = "jdbc:postgresql://localhost:5432/booklickdb-dev-content?currentSchema=public";


            // connect mac
            //props.setProperty("user","adminchecklemon");
            // props.setProperty("password","fitpal");

            System.out.println(props);
            Connection connection = null;
            connection = DriverManager.getConnection(props.getProperty("POSTGRES_URL").toString(), props.getProperty("POSTGRES_USER").toString(), props.getProperty("POSTRGES_PASSWORD").toString());
            ConnectionSQL connectionSQL = new ConnectionSQL();
            Connection connectionWithUtil = connectionSQL.getConnection();


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

            // Connection without Repository END


        } /*catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found.");
            e.printStackTrace();
        }*/ catch (SQLException | IOException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}


