package structural.proxy.cachingproxy;

public class Product {
    private final String productId;
    private final String name;
    private final double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[Product] id=" + productId + ", name=" + name + ", price=" + price;
    }
}
