public interface CoffeeOrderBoard {
    void add(String name);
    Order deliver();
    Order deliver(int num);
    void  draw();
}
