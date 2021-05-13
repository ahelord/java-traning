package com.ahelord.jdbctest;

import utils.ConnectionSQL;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final String SQL_SELECT = "SELECT email FROM public.user";
    private static final String SQL_INSERT = "INSERT INTO public.user(email) values (?)";
    private static final String SQL_UPDATE = "UPDATE public.user SET email = ? WHERE email like ?";
    private static final String SQL_DELETE = "DELETE FROM public.user WHERE email like ? ";

    public List<User> findAll() throws IOException, SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = null;
        List<User> users = new ArrayList<>();
        connection = new ConnectionSQL().getConnection();
        statement = connection.prepareStatement(SQL_SELECT);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            users.add(new User(resultSet.getString("email")));
        }
        statement.close();
        resultSet.close();
        connection.close();
        return users;
    }
    public boolean inserted(User user) throws IOException, SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        connection = new ConnectionSQL().getConnection();
        statement = connection.prepareStatement(SQL_INSERT);
        System.out.println(statement);

        statement.setString(1,user.getEmail());
       return 0 < statement.executeUpdate();

    }

    public boolean deleted(User user) throws IOException, SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        connection = new ConnectionSQL().getConnection();
        statement = connection.prepareStatement(SQL_DELETE);
        System.out.println(statement);
        statement.setString(1,user.getEmail());
        return 0 < statement.executeUpdate();

    }

    public boolean updated(User user) throws IOException, SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        connection = new ConnectionSQL().getConnection();
        statement = connection.prepareStatement(SQL_UPDATE);
        System.out.println(statement);
        statement.setString(1,user.getEmail());
        statement.setString(2,user.getEmail());

        return 0 < statement.executeUpdate();

    }
}
