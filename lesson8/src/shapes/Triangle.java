package shapes;

public class Triangle implements Shape {
    private final int sideA = 34;
    private final int sideB = 56;
    @Override
    public int area() {
        return sideA * sideB;
    }
}