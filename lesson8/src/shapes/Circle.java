package shapes;
public class Circle implements Shape {
    private final int radius = 15;
    @Override
    public int area() {
        return (int) (Math.PI * Math.sqrt(radius));
    }
}