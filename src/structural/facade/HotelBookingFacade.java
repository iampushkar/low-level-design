package structural.facade;

public class HotelBookingFacade {

    private final AvailabilityService availabilityService = new AvailabilityService();
    private final PaymentService paymentService = new PaymentService();
    private final KYCService kycService = new KYCService();
    private final BookingService bookingService = new BookingService();
    private final NotificationService notificationService = new NotificationService();

    public void bookHotel(String userId, String roomType, String paymentDetails) {
        System.out.println("Starting hotel booking process...");

        if (!availabilityService.isRoomAvailable(roomType)) {
            System.out.println("Room not available!");
            return;
        }

        if (!kycService.verifyUser(userId)) {
            System.out.println("User verification failed!");
            return;
        }

        if (!paymentService.processPayment(paymentDetails)) {
            System.out.println("Payment failed!");
            return;
        }

        String bookingId = bookingService.bookRoom(userId, roomType);
        notificationService.sendConfirmation(userId, bookingId);

        System.out.println("Booking successful! Booking ID: " + bookingId);
    }
}
