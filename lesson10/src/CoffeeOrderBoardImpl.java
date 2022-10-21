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
    public void deliver() {
        Collections.sort(orders);
        orders.remove(orders.getFirst());
    }

    @Override
    public Order deliver(int orderNumber){
        for (Order ord: orders) {
            if(ord.getOrderNumber() == orderNumberl){
                orders.remove(ord)
            }  return ord;
        } else if(ord.getOrderNumber() == null) {
        System.out.println("Order is non present!!!") 
    }

    @Override
    public void draw(){
        System.out.println("===========" +"\n"+"Num" + " | " + "Name");
        orders.forEach((n) -> System.out.println(n.toString()));
    }
}
