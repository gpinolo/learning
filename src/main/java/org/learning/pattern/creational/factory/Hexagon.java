package org.learning.pattern.creational.factory;

public class Hexagon implements Polygon {

    private final int sideLength;

    public Hexagon(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2) * 2.598;
    }
}
