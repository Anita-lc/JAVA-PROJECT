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
    private long submittedBy;
    private String assignedTo;

    public Complaint(String description, String status, String type, String complaintId) {
        this.description = description;
        this.status = status;
        this.type = type;
        this.complaintId = generateComplaintId();
    }

    // Additional constructor for database operations
    public Complaint(String description, String type, long submittedBy) {
        this.description = description;
        this.type = type;
        this.submittedBy = submittedBy;
        this.status = "OPEN";
        this.complaintId = generateComplaintId();
    }

    // Enhanced methods for better functionality
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void assignComplaint(String staffId) {
        this.assignedTo = staffId;
        this.status = "ASSIGNED";
    }

    public void displayComplaintDetails() {
        System.out.println("=== Complaint Details ===");
        System.out.println("ID: " + complaintId);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Submitted by: " + (submittedBy != 0 ? submittedBy : "Unknown"));
        System.out.println("Assigned to: " + (assignedTo != null ? assignedTo : "Not assigned"));
        System.out.println("========================");
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

    public long getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(long submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    private String generateComplaintId() {
        return "COMP-" + System.currentTimeMillis();
    }

}
