package org.learning.solid.singleresponsibility;

public class Square implements Shape {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
