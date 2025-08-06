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
    static String userName, password;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting for username and password
        System.out.print("Enter username: ");
        userName = input.nextLine();

        System.out.print("Enter password: ");
        password = input.nextLine();

        // Call the login check
        getConnection();
    }

    public static void getConnection() {
        Connection dbConnect = null;

        try {
            // Step 2: Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 3: Establish DB connection
            dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/complaints system", "root", "");

            if (dbConnect != null) {
                System.out.println("Connection Successful");

                // Step 4: Create a statement
                Statement stmt = dbConnect.createStatement();

                // Step 5: Execute query
                String query = "SELECT * FROM users WHERE userName = '" + userName + "'";
                ResultSet rs = stmt.executeQuery(query);

                // Step 6: Check if user exists and validate password
                if (rs.next()) {
                    String dbPassword = rs.getString("password");

                    if (password.equals(dbPassword)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Wrong password! Login failed.");
                    }
                } else {
                    System.out.println("User not found.");
                }

                rs.close();
                stmt.close();
            }

        } catch (ClassNotFoundException cnfe) {
            System.out.println("JDBC Driver not found: " + cnfe.getMessage());
        } catch (SQLException ex) {
            System.out.println("Database connection error: " + ex.getMessage());
        } finally {
            try {
                if (dbConnect != null && !dbConnect.isClosed()) {
                    dbConnect.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
