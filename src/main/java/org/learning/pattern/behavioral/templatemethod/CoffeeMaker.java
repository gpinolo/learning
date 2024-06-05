package org.learning.pattern.behavioral.templatemethod;

import java.util.logging.Logger;

public class CoffeeMaker extends BeverageMaker {

    private static final Logger LOGGER = Logger.getLogger(CoffeeMaker.class.getName());

    @Override
    protected void prepare() {
        LOGGER.info("add coffe blend");
    }

    @Override
    protected void addCondiment() {
        LOGGER.info("add sugar");
    }

    @Override
    protected Beverage ready() {
        return new Coffee();
    }
}
