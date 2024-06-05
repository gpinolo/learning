package org.learning.solid.singleresponsibility;

public class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
