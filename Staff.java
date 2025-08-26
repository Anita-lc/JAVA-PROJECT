/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Admin
 */
public class Staff extends User {

    private String staffId;
    private String position;
  

    public Staff(String staffId, String name, String position, String department) {
        super(staffId, name);
        this.staffId = staffId;
        this.position = position;
        this.department=department;
    }

    public void displayUserInfo() {
        System.out.println("=== Staff Information ===");
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Position: " + position);
        System.out.println("Department:"+ department);
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
