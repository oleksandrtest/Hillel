package one;

import one.Shape;

public class Triangle implements Shape {

    private final int a = 34;
    private final int b = 56;



    @Override
    public int area() {

        return a * b;
    }
}
