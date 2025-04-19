package structural.facade;

public class Main {
    public static void main(String[] args) {
        HotelBookingFacade bookingFacade = new HotelBookingFacade();

        String userId = "USER-001";
        String roomType = "Deluxe";
        String paymentDetails = "CreditCard: 1234-5678-9101-5678";

        bookingFacade.bookHotel(userId, roomType, paymentDetails);
    }
}
