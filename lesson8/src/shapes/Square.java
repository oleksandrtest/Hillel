package shapes;

public class Square implements Shape {
    private final int sideA = 45;
    public int area() {
        return sideA * sideA;
    }
}