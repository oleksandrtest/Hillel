package task_one;

public class Main {
    public static int sumArea() {
        Shape[] shapes = {new Circle(), new Triangle(), new Square()};
        var sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum = sum + shapes[i].area();
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumArea());
    }
}