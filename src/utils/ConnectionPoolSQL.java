package utils;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionPoolSQL {
    private String POSTGRES_URL;
    private String POSTGRES_USER;
    private String POSTGRES_PASSWORD;
    private Connection connection;

    public DataSource getDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(this.POSTGRES_URL);
        dataSource.setUsername(this.POSTGRES_USER);
        dataSource.setPassword(this.POSTGRES_PASSWORD);
        // Se define el tamaño del pool de conexiones
        int poolSize = 5;
        dataSource.setInitialSize(poolSize);
        return dataSource;
    }

    public ConnectionPoolSQL() throws IOException {

        try (InputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/aplication.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            this.POSTGRES_URL = prop.getProperty("POSTGRES_URL");
            this.POSTGRES_USER = prop.getProperty("POSTGRES_USER");
            this.POSTGRES_PASSWORD = prop.getProperty("POSTRGES_PASSWORD");
            this.connection = this.getDataSource().getConnection();
        } catch (IOException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    public Connection getConnection() throws SQLException {
        return this.connection;
    }
    public void close(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }
    public void close(Statement statement) throws SQLException {
        statement.close();
    }

    public void close(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    public void close(Connection connection) throws SQLException {
        connection.close();
    }
}
