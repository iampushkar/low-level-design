package structural.proxy.cachingproxy;

public class Main {
    public static void main(String[] args) {
        IProductRepository realRepo = new ProductRepository();
        IProductRepository cachingRepo = new CachedIProductRepositoryProxy(realRepo);

        System.out.println(cachingRepo.getProductById("p1"));
        System.out.println(cachingRepo.getProductById("p2"));
        System.out.println(cachingRepo.getProductById("p1")); // from cache
        System.out.println(cachingRepo.getProductById("p3")); // not found
    }
}
