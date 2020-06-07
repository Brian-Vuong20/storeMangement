package store_management;

import java.sql.*;

public class MyConnection {
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/myDatabase?useSSL=false", "root", "12345678");
            
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}