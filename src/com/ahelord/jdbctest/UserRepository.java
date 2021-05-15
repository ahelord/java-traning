package com.ahelord.jdbctest;

import utils.ConnectionSQL;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// para las transaccciones deben ejecutarse por una transaccion
public class UserRepository {
    private static final String SQL_SELECT = "SELECT email FROM public.user";
    private static final String SQL_INSERT = "INSERT INTO public.user(email) values (?)";
    private static final String SQL_UPDATE = "UPDATE public.user SET email = ? WHERE email like ?";
    private static final String SQL_DELETE = "DELETE FROM public.user WHERE email like ? ";
    private Connection transactionalConnection;

    public UserRepository() {
    }

    public UserRepository(Connection transactionalConnection) {
        this.transactionalConnection = transactionalConnection;
    }

    public List<User> findAll() throws IOException, SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = null;
        List<User> users = new ArrayList<>();
        connection = this.transactionalConnection != null ? this.transactionalConnection : new ConnectionSQL().getConnection();
        statement = connection.prepareStatement(SQL_SELECT);
        resultSet = statement.executeQuery();
        while (resultSet.next()) {
            users.add(new User(resultSet.getString("email")));
        }
        statement.close();
        resultSet.close();
        if(this.transactionalConnection == null){
            connection.close();
        }

        return users;
    }

    public boolean inserted(User user) throws IOException, SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        connection = this.transactionalConnection != null ? this.transactionalConnection : new ConnectionSQL().getConnection();
        statement = connection.prepareStatement(SQL_INSERT);
        System.out.println(statement);

        statement.setString(1, user.getEmail());

        boolean isInserted = 0 < statement.executeUpdate();
        if(this.transactionalConnection == null){
            connection.close();
        }
        return isInserted;

    }

    public boolean deleted(String filter) throws IOException, SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        connection = this.transactionalConnection != null ? this.transactionalConnection : new ConnectionSQL().getConnection();
        statement = connection.prepareStatement(SQL_DELETE);
        System.out.println(statement);
        statement.setString(1, filter);
        boolean isDeleted = 0 < statement.executeUpdate();
        if(this.transactionalConnection == null){
            connection.close();
        }
        return isDeleted;

    }

    public boolean updated(String filter,String update) throws IOException, SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        connection = this.transactionalConnection != null ? this.transactionalConnection : new ConnectionSQL().getConnection();
        statement = connection.prepareStatement(SQL_UPDATE);
        System.out.println(statement);
        statement.setString(1, update);
        statement.setString(2,filter);

        boolean isUpdated = 0 < statement.executeUpdate();
        if(this.transactionalConnection == null){
            connection.close();
        }
        return isUpdated;

    }
}
