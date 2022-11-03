import java.time.LocalDateTime;
import java.util.UUID;

public class Product {

    private UUID id = UUID.randomUUID();
    private String type;
    private Double price;
    private boolean isDiscount;
//    private LocalDateTime date = LocalDateTime.now().minus(1, ChronoUnit.YEARS);
    private LocalDateTime date = LocalDateTime.now();

    public Product(String type, Double price, boolean isDiscount) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
    }

    public UUID getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean getDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        this.isDiscount = discount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Product {" +
                " id = " + id +
                ", type = '" + type + '\'' +
                ", price = " + price +
                ", isDiscount = " + isDiscount +
                ", date = " + date +
                " }";
    }
}
