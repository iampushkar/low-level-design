package structural.facade;

public class BookingService {
    public String bookRoom(String userId, String roomType) {
        System.out.println("Booking room for user " + userId + " with type: " + roomType);
        return "BOOKING12345"; // Dummy booking ID
    }
}
