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

    public Notification(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
        this.notificationId = generateNotificationId();
    }
public static void main (String[] args){
    
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
    private String generateNotificationId() {
        return "NOTIF-" + System.currentTimeMillis();
    } 
}
