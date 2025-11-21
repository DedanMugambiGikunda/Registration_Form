/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    public static Connection getConnection() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/registration", "root", "your_password");
            
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
