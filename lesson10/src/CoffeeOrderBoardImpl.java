import java.util.Collections;
import java.util.LinkedList;
public class CoffeeOrderBoardImpl  implements  CoffeeOrderBoard {
    private LinkedList<Order> orders = new LinkedList<>();

    @Override
    public void add(String name){
        var order = new Order(name, 1);
        if(!orders.contains(order)){
            orders.addLast(order);
        }
    }

    @Override
    public Order deliver() {
        Collections.sort(orders);
        Order firstOrder = orders.getFirst();
        orders.remove(firstOrder);
        return firstOrder;
    }

    @Override
    public Order deliver(int orderNumber) {
            for (Order ord : orders) {
                if (ord.getOrderNumber() == orderNumber) {
                    orders.remove(ord);
                    return ord;
                }
            } System.out.println("Order " + orderNumber + " not found!!!");
        return null;
    }

    @Override
    public void draw () {
        System.out.println("===========" + "\n" + "Num" + " | " + "Name");
        orders.forEach((n) -> System.out.println(n.toString()));
    }

}