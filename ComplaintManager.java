/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ComplaintManager {
    private DBConnection con;

    public ComplaintManager(DBConnection con) {
        this.con = con;
    }
    public void showComplaints(){
    //fetch list of complaints
    //show list of complaints
}
    public void createComplaint(){
        //prompt user for complaint details
        //insert complaint into database
   Scanner sc = new Scanner(System.in);

        System.out.println("===== CREATE COMPLAINT =====");
        System.out.print("Enter complaint title: ");
        String title = sc.nextLine();

        System.out.print("Enter complaint description: ");
        String description = sc.nextLine();

        //insert complaint into database
        try {
            Connection connection = con.getConnection();
            String query = "INSERT INTO complaints (title, description) VALUES (?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, title);
            stmt.setString(2, description);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Complaint submitted successfully!\n");
            } else {
                System.out.println("Failed to submit complaint.\n");
            }

            // Show a list of all complaints to demonstrate the new one
            showComplaints();

        } catch (SQLException e) {
            System.out.println("Error creating complaint: " + e.getMessage());
        }
    }
}
