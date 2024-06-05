package org.learning.pattern.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonFactoryTests {

    @Test
    void createPentagon() {
        PolygonFactory polygonFactory = new PolygonFactory();
        int sideLength = 2;
        Polygon polygon = polygonFactory.createPolygon(5, sideLength);
        double pentagonArea = polygon.calculateArea();
        double expected = Math.pow(sideLength, 2) * 1.72;
        assertEquals(expected, pentagonArea, "Unexpected pentagon area value");
    }

    @Test
    void createHexagon() {
        PolygonFactory polygonFactory = new PolygonFactory();
        int sideLength = 2;
        Polygon polygon = polygonFactory.createPolygon(6, sideLength);
        double pentagonArea = polygon.calculateArea();
        double expected = Math.pow(sideLength, 2) * 2.598;
        assertEquals(expected, pentagonArea, "Unexpected pentagon area value");
    }
}