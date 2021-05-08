package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionSQL {
    InputStream inputStream;
    private String POSTGRES_URL;
    private String POSTGRES_USER;
    private String POSTGRES_PASSWORD;

    public ConnectionSQL() throws IOException {

        try (InputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/aplication.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            this.POSTGRES_URL = prop.getProperty("POSTGRES_URL");
            this.POSTGRES_USER = prop.getProperty("POSTGRES_USER");
            this.POSTGRES_PASSWORD = prop.getProperty("POSTRGES_PASSWORD");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.POSTGRES_URL,this.POSTGRES_USER,this.POSTGRES_PASSWORD);
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
