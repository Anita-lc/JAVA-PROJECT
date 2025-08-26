/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

// Step 1: Import relevant classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DBConnection {

//    static String userName, password;
    Connection dbConnect = null;

    public void connect() {
        try {
            // Step 2: Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 3: Establish DB connection
            dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/complaints system", "root", "");
            System.out.println("Connection Successful");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("JDBC Driver not found: " + cnfe.getMessage());
        } catch (SQLException ex) {
            System.out.println("Database connection error: " + ex.getMessage());
        
        }
    }

    public void disconnect() {
        try {
            if (dbConnect != null && !dbConnect.isClosed()) {
                dbConnect.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return dbConnect;
    }
}
