import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ShopTest {
    @Test //  Проверяем метод getMostExpensiveProduct, если магазин пустой
    void testGetMostExpensiveProductWhenShopIsEmpty() {
        Shop shop = new Shop();
        assertNull(shop.getMostExpensiveProduct());
    }

    @Test //  Проверяем метод getMostExpensiveProduct, если в магазине есть продукты
    void testGetMostExpensiveProductWhenShopHasProducts() {
        Shop shop = new Shop();
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 20.0);
        shop.addProduct(product1);
        shop.addProduct(product2);
        assertEquals(product2, shop.getMostExpensiveProduct());
    }
        @Test // Проверяем метод sortProductsByPrice, правильность сортировки
        void testSortProductsByPrice() {
            Shop shop = new Shop();
            Product product1 = new Product("Product 1", 30.0);
            Product product2 = new Product("Product 2", 20.0);
            Product product3 = new Product("Product 3", 10.0);
            shop.addProduct(product1);
            shop.addProduct(product2);
            shop.addProduct(product3);
    
            shop.sortProductsByPrice();
            List<Product> sortedProducts = shop.getProducts(); 
            // предположим, что у нас есть метод getProducts в классе Shop
    
            // Проверяем, что продукты отсортированы по возрастанию цены
            assertEquals(product3, sortedProducts.get(0));
            assertEquals(product2, sortedProducts.get(1));
            assertEquals(product1, sortedProducts.get(2));
    }    
}
