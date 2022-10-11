package shapes;

public class Main {
    public static int sumArea() {
        Shape[] shapes = {new Circle(), new Triangle(), new Square()};
        var sum = 0;
        for (Shape shape: shapes) {
            sum += shape.area();
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumArea());
    }
}