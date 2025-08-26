/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        //Connect to the database
        DBConnection con = new DBConnection(); 
        con.connect();
        //Authenticate(Login/ register)
        Auth auth= new Auth(con);
        auth.register("AC", "456");
        //Show a list of complaints
        ComplaintManager manager = new ComplaintManager(con);
        //Show user menu
        //Ask them for choice(view complaints/create complaint)
        //Implement the choice
        Scanner sc = new Scanner(System.in);

        while (!auth.isLoggedIn()) {
            System.out.println("===== LOGIN MENU =====");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter username: ");
                String userName = sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();

                if (auth.login(userName, password)) {
                    System.out.println("Login failed. Try again.\n");
                } else {
                    System.out.println("Login successful!\n");
                }
            } else if (choice == 2) {
                System.out.print("Choose a username: ");
                String userName = sc.nextLine();
                System.out.print("Choose a password: ");
                String password = sc.nextLine();

                auth.register(userName, password);
                System.out.println("Registration successful. You can now log in.\n");
            } else {
                System.out.println("Invalid choice. Try again.\n");
            }
        }
        while (true) {
            System.out.println("===== COMPLAINTS MENU =====");
            System.out.println("1. Show Complaints");
            System.out.println("2. Add Complaint");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                manager.showComplaints();
            } else if (choice == 2) {
                manager.createComplaint();
            } else if (choice == 3) {
                System.out.println("Exiting... Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.\n");
            }
        }
    }
    }
    

