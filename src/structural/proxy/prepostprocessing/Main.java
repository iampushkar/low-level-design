package structural.proxy.prepostprocessing;

public class Main {
    public static void main(String[] args) {
        PaymentService realService = new PaymentServiceImpl();
        PaymentService loggingProxy = new LoggingPaymentProxy(realService);

        loggingProxy.processPayment("user123", 500);   // ✅ should succeed
        loggingProxy.processPayment("user999", 1500);  // ❌ should fail with error
    }
}

