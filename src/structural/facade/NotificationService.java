package structural.facade;

public class NotificationService {
    public void sendConfirmation(String userId, String bookingId) {
        System.out.println("Sending confirmation to user " + userId + " for booking: " + bookingId);
    }
}
