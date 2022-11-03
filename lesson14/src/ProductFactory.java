import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProductFactory {
     static List<Product> getTestProducts() {

        List<Product> books = getGeneratedProducts("Book");
        List<Product> phones = getGeneratedProducts("Phone");
        List<Product> toys = getGeneratedProducts("Toy");
        List<Product> cars = getGeneratedProducts("Car");

        return Stream.of(books, phones, toys, cars)
                .flatMap(Collection::stream)
                .toList();
    }

    static List<Product> getGeneratedProducts(String type) {
        List<Product> bookWithDiscount = IntStream.range(1, 10)
                .boxed()
                .map(price -> price * 100.0)
                .map(price -> new Product(type, price, Boolean.TRUE))
                .toList();

        List<Product> bookWithoutDiscount = IntStream.range(1, 10)
                .boxed()
                .map(price -> price * 140.0)
                .map(price -> new Product(type, price, Boolean.FALSE))
                .toList();
        return Stream.concat(bookWithDiscount.stream(), bookWithoutDiscount.stream()).toList();
    }


}