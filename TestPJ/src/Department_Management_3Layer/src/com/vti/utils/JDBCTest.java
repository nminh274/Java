package com.vti.utils;
import java.io.*;
import java.util.*;
import java.sql.*;

public class JDBCTest {
    private Properties prop;
    private Connection conn;
    public JDBCTest() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        prop = new Properties();
        prop.load(new FileInputStream("C:\\Users\\Minh Tran\\Desktop\\code\\Java\\VTI_Java\\Department_Management\\src\\com\\vti\\resources\\db.properties"));
    }
    public void testConnection() throws SQLException, ClassNotFoundException {
        String url = prop.getProperty("url");
        String user  = prop.getProperty("user");
        String password = prop.getProperty("password");
        String driver = prop.getProperty("driver");
        Class.forName(driver);
        conn = DriverManager.getConnection(url,user,password);
        System.out.println("Connected to database successfully");
    }
    public Connection getConnection() throws SQLException {
        String url = prop.getProperty("url");
        String user = prop.getProperty("user");
        String password = prop.getProperty("password");
        String driver = prop.getProperty("driver");
        conn = DriverManager.getConnection(url,user,password);
        return conn;
    }
    public void disconnect() throws SQLException {
        conn.close();
    }
    public ResultSet executeQuery(String qr)  throws SQLException {
        Connection conn = getConnection();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(qr);
        return rs;
    }
    public PreparedStatement prepareStatement(String qr)  throws SQLException {
        Connection conn = getConnection();
        PreparedStatement pstm = conn.prepareStatement(qr);
        return pstm;
    }
}
