package structural.bridge;

import structural.bridge.abstraction.AlertNotification;
import structural.bridge.abstraction.Notification;
import structural.bridge.abstraction.PromotionalNotification;
import structural.bridge.implementor.EmailSender;
import structural.bridge.implementor.MessageSender;
import structural.bridge.implementor.PushSender;
import structural.bridge.implementor.SMSSender;

public class NotificationSystemClient {
    public static void main(String[] args) {

        System.out.println("Notification System : ");
        System.out.println("-----------------------");

        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();
        MessageSender pushSender = new PushSender();

        Notification alert = new AlertNotification(emailSender);
        alert.notifyUser("Someone has logged in", "pushkar@gmail.com");

        Notification sms = new PromotionalNotification(smsSender);
        sms.notifyUser("Huge Discount", "101");
    }
}
