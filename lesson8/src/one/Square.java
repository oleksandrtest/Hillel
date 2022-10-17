package one;

public class Square implements Shape {
    private final int side = 45;

    public int area() {
        return side * side;
    }
}