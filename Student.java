/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Admin
 */
public class Student extends User {

    /**
     *
     * @param args
     */
    private String studentId;
    private String contactNumber;
    private String yearofStudy;

    public Student(String studentId, String name, String email, String department, String contactNumber, String yearofStudy) {
        super(studentId, name);
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.department = department;
        this.contactNumber = contactNumber;
        this.yearofStudy = yearofStudy;
    }

    public void displayUserInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Year of Study: " + yearofStudy);
        System.out.println("Contact: " + contactNumber);
    }

    public boolean canCreateComplaint() {
        return true; // Students can create complaints
    }

    public boolean canHandleComplaint() {
        return false; // Students cannot handle complaints
    }
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getYearofStudy() {
        return yearofStudy;
    }

    public void setYearofStudy(String yearofStudy) {
        this.yearofStudy = yearofStudy;
    }
}
