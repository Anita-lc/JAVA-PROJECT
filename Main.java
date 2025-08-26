/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

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
    }
}
