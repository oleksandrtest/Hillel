import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) throws Exception {

        // task 1.2
        productsByTypeAndPrice("Book");
        // task 2.2
        productsByDiscountIsTrue("Book");
        // task 3.2
        productWithMinPrice("Book");
        // task 4.2
        treeLastProducts();
        // task 5.2
        sumProductsByYear("Phone");
        // task 6.2
        productsGroupByType();
        // task 3.3
        productWithMinPrice("Knife");

    }

    public static void productsByTypeAndPrice(String type) {
        List<Product> testData = ProductFactory.getTestProducts();
        List<Product> products = testData.stream()
                .filter(product -> type.equals(product.getType()))
                .filter(product -> product.getPrice() > 250)
                .toList();

        products.forEach(System.out::println);
    }

    public static void productsByDiscountIsTrue(String type) {
        List<Product> testData = ProductFactory.getTestProducts();
        List<Product> products = testData.stream()
                .filter(product -> type.equals(product.getType()))
                .filter(Product::getDiscount)
                .toList();

        products.forEach(product -> product.setPrice(product.getPrice() * 0.9));
        products.forEach(System.out::println);
    }

    public static void productWithMinPrice (String type) throws Exception {
        List<Product> testData = ProductFactory.getTestProducts();
        Product product = testData.stream()
                .filter(prod -> type.equals(prod.getType()))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new Exception(String.format("Product [type:%s] is not found",type)));

        System.out.println(product);
    }

    public static void treeLastProducts(){
        List<Product> testData = ProductFactory.getTestProducts();
        List<Product> products = testData.stream().sorted(Comparator.comparing(Product::getDate).reversed())
                .limit(3).toList();

        System.out.println(products);
    }

    public static void sumProductsByYear(String type){
        List<Product> testData = ProductFactory.getTestProducts();
        double sumCount = testData.stream()
                .filter(product -> type.equals(product.getType()))
                .filter(product -> product.getPrice() > 75.0)
                .filter(product -> product.getDate().getYear() == LocalDateTime.now().getYear())
                .mapToDouble(Product::getPrice).sum();
        System.out.println(sumCount);
    }

    public static void productsGroupByType(){
        List<Product> testData = ProductFactory.getTestProducts();
        Map<String, List<Product>> products = testData.stream()
                .collect(Collectors.groupingBy(Product::getType, mapping(Function.identity(), toList())));

        System.out.println(products);
    }
}