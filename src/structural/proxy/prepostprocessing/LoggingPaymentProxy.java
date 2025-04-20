package structural.proxy.prepostprocessing;

public class LoggingPaymentProxy implements PaymentService {

    private final PaymentService realService;

    public LoggingPaymentProxy(PaymentService realService) {
        this.realService = realService;
    }

    @Override
    public boolean processPayment(String userId, double amount) {
        long start = System.currentTimeMillis();
        System.out.println("[LOG] START: processPayment for " + userId + ", amount: $" + amount);

        try {
            boolean result = realService.processPayment(userId, amount);
            System.out.println("[LOG] SUCCESS: Payment processed");
            return result;
        } catch (Exception ex) {
            System.out.println("[LOG] ERROR: " + ex.getMessage());
            return false;
        } finally {
            long end = System.currentTimeMillis();
            System.out.println("[LOG] END: Took " + (end - start) + "ms");
        }
    }
}

