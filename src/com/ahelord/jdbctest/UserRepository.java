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
    public List<User> findAllUsers() throws IOException, SQLException {
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
}
