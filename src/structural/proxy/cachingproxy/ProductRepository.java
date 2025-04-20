package structural.proxy.cachingproxy;

import java.util.Map;

public class ProductRepository implements IProductRepository {

    private final Map<String, Product> database = Map.of(
            "p1", new Product("p1", "Laptop", 120000.0),
            "p2", new Product("p2", "Phone", 50000.0)
    );

    @Override
    public Product getProductById(String productId) {
        simulateDbDelay();
        return database.get(productId);
    }

    private void simulateDbDelay() {
        try {
            System.out.println("Fetching from DB...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
