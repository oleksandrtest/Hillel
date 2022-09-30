public class Cat extends Enimal {

    static int number;
    private final int runDistanceMax =  200;
    private final int swimDistanceMax = 0;

    public Cat() {
        number++;
    }



    @Override
    public void run(int distance) {
        if (distance <= runDistanceMax){
            System.out.println( getName() + " пробіг " + distance + "м");
        } else System.out.println( getName() + " здох !!!!");
    }
    @Override
    public void swim(int distance) {
        if (distance <= swimDistanceMax){
            System.out.println( getName() + " проплив " + distance + "м");
        } else System.out.println(getName() + " втопився !!!!");
    }
}
