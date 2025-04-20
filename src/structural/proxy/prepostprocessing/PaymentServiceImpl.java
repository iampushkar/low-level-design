package structural.proxy.prepostprocessing;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public boolean processPayment(String userId, double amount) {
        System.out.println("Processing payment of $" + amount + " for user " + userId);
        if (amount > 1000) {
            throw new IllegalArgumentException("Amount too high!");
        }
        return true;
    }
}

