/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Admin
 */
public class Notification {

    private final String notificationId;
    private String message;
    private String recipient;
    private String type;
    private boolean isRead;

    public Notification(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
        this.type = "GENERAL";
        this.isRead = false;
        this.notificationId = generateNotificationId();
    }

    // Enhanced constructor with type
    public Notification(String message, String recipient, String type) {
        this.message = message;
        this.recipient = recipient;
        this.type = type;
        this.isRead = false;
        this.notificationId = generateNotificationId();
    }

    // Enhanced methods for better functionality
    public void markAsRead() {
        this.isRead = true;
    }

    public void displayNotification() {
        System.out.println("=== Notification ===");
        System.out.println("ID: " + notificationId);
        System.out.println("Type: " + type);
        System.out.println("Message: " + message);
        System.out.println("Recipient: " + recipient);
        System.out.println("Status: " + (isRead ? "Read" : "Unread"));
        System.out.println("==================");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRead() {
        return isRead;
    }

    private String generateNotificationId() {
        return "NOTIF-" + System.currentTimeMillis();
    }
}
