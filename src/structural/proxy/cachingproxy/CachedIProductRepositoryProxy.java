package structural.proxy.cachingproxy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CachedIProductRepositoryProxy implements IProductRepository {

    private final IProductRepository realRepository;
    private final Map<String, Product> cache = new ConcurrentHashMap<>();

    public CachedIProductRepositoryProxy(IProductRepository realRepository) {
        this.realRepository = realRepository;
    }

    @Override
    public Product getProductById(String productId) {
        if (cache.containsKey(productId)) {
            System.out.println("Returning from cache...");
            return cache.get(productId);
        }

        Product product = realRepository.getProductById(productId);
        if (product != null) {
            cache.put(productId, product);
        }
        return product;
    }
}
