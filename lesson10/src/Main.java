public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoardImpl();

        //Method add new order by Name.
        coffeeOrderBoard.add("Alex1");
        coffeeOrderBoard.add("Alex2");
        coffeeOrderBoard.add("Alex3");
        coffeeOrderBoard.add("Alex4");
        coffeeOrderBoard.add("Alex5");
        coffeeOrderBoard.add("Alex6");
        coffeeOrderBoard.add("Alex7");

        //Method  deliver first order
        System.out.println(coffeeOrderBoard.deliver());

        //Method  deliver order by number
        System.out.println(coffeeOrderBoard.deliver(3));

        coffeeOrderBoard.deliver(8);

        //Method represent queue status
        coffeeOrderBoard.draw();
    }

}