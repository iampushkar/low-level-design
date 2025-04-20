package structural.proxy.prepostprocessing;

public interface PaymentService {
    boolean processPayment(String userId, double amount);
}
