/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Admin
 */
public class Complaint {

   private String complaintId;
    private String description;
    private String status;
    private String type;

    public Complaint(String description, String status, String type) {
        this.description = description;
        this.status = status;
        this.type = type;
        this.complaintId = generateComplaintId();
    }
public static void main (String[] args){
    
}
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getComplaintId() {
        return complaintId;
    }

    private String generateComplaintId() {
        return "COMP-" + System.currentTimeMillis();
    }
    
}

