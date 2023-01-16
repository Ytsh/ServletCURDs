package org.example.repository;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private final String url = "jdbc:mysql://localhost:3306/ecommerce?verifyServerCertificate=false&useSSL=false&requireSSL=false";
    private final String dbUsername = "root";
    private final String dbPassword = "";
    private final String driverName = "com.mysql.jdbc.Driver";
    protected java.sql.Connection connection;

    protected void setConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driverName);
        connection = DriverManager.getConnection(url, dbUsername, dbPassword);
    }
    protected void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
