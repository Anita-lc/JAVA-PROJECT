/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Auth {

    private boolean isLoggedIn = false;
    private DBConnection con;

    public Auth(DBConnection con) {
        this.con = con;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void login(String userName, String password) {
        //login to database
        try {
            // Step 4: Create a statement

            Statement stmt = con.getConnection().createStatement();

            // Step 5: Execute query
            String query = "SELECT * FROM users WHERE userName = '" + userName + "' AND password = '" + password + "'";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            // Step 6: Check if username and password exists
            if (rs.next()) {
                System.out.println("Login successful!");

                isLoggedIn = true;
            } else {
                System.out.println("Username or password invalid");

            }

        } catch (SQLException ex) {
            System.out.println("Database connection error: " + ex.getMessage());

        } finally {
            //con.disconnect();
        }

    }

    public void register(String userName, String password) {
//Check if user exists
        login(userName, password);
        if (isLoggedIn) {
            System.out.println("username/ password  already exists");
            return;
        }
        long userid = System.currentTimeMillis();
        System.out.println("Registering...");
        String query = "INSERT INTO users(userid, userName, password) VALUES ( "+ userid + ",'" + userName + "', '" + password + "')";
        System.out.println(query);
        Statement statement = null;
        try{
            statement = con.getConnection().createStatement();
            statement.execute(query);
            System.out.println("Registration succesful");
            isLoggedIn = true;
            
        } catch (SQLException ex) {
            System.out.println("Database connection error: " + ex.getMessage());

        } finally {
            con.disconnect();
        }
        //String s = String.format("SELECT * FROM %s WHERE userName = '%s' AND password = '%s'", "users", "AC", "12345");
        
    }
}
