package org.learning.solid.singleresponsibility;

import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class TotalAreaTests {

    private static final Logger LOGGER = Logger.getLogger(TotalAreaTests.class.getName());

    @Test
    void printTotalAreaRespectingSingleResponsibilityPrinciple() {
        int side = 5;
        Shape square = new Square(side);
        int radius = 4;
        Shape circle = new Circle(radius);
        TotalArea totalArea = new TotalArea(square, circle);
        double sum = totalArea.sum();
        //the following method clash with single responsibility principle
        totalArea.printTotalArea();
        //print in a different class instead
        if(LOGGER.isLoggable(Level.INFO)){
            LOGGER.info("Sum of the areas of provided shapes:" + sum);
        }
        double expected = Math.pow(side, 2) + Math.pow(radius, 2) * Math.PI;
        assertEquals(expected, sum, "Unexpected area sum");
    }
}