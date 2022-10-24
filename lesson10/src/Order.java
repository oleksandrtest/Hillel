public class Order implements Comparable<Order> {
    private String name;
    private int orderNumber;
    static int counter = 1;

    public Order(String name, int orderNumber) {
        this.name = name;
        this.orderNumber = counter++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public int compareTo(Order o) {
        int comparedSize = o.orderNumber;
        if (this.orderNumber > comparedSize) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return  " "+orderNumber + " | " +
                name;
    }
}