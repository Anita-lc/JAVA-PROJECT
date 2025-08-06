/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Admin
 */
public class Student {

    /**
     *
     * @param args
     */    
    private String studentId;
    private String name;
    private String email;
    private String department;
    private String contactNumber;
    private String yearofStudy;
    
    public Student(String studentId, String name, String email, String department, String contactNumber, String yearofStudy) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.department = department;
        this.contactNumber = contactNumber;
        this.yearofStudy = yearofStudy;
    }
    public static void main (String[] args){
        
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
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
