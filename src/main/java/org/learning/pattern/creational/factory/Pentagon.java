package org.learning.pattern.creational.factory;

public class Pentagon implements Polygon {

    private final int sideLength;

    public Pentagon(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2) * 1.72;
    }
}
