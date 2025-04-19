package structural.facade;

public class PaymentService {
    public boolean processPayment(String paymentDetails) {
        System.out.println("Processing payment with details: " + paymentDetails);
        return true; // Dummy logic
    }
}
