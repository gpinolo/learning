package org.learning.solid.singleresponsibility;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TotalArea {

    private static final Logger LOGGER = Logger.getLogger(TotalArea.class.getName());

    private final Shape[] shapes;

    public TotalArea(Shape ... shapes) {
        this.shapes = shapes;
    }

    public double sum(){
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculateArea();
        }
        return sum;
    }


    /**
     * @deprecated This method clash with single responsibility
     */
    @Deprecated(since = "demo")
    public void printTotalArea(){
        if(LOGGER.isLoggable(Level.INFO)){
            LOGGER.info("Sum of the areas of provided shapes: " + sum());
        }
    }
}
