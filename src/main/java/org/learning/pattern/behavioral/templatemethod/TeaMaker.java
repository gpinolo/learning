package org.learning.pattern.behavioral.templatemethod;

import java.util.logging.Logger;

public class TeaMaker extends BeverageMaker {

    private static final Logger LOGGER = Logger.getLogger(TeaMaker.class.getName());

    @Override
    protected void prepare() {
        LOGGER.info("add tea bag");
    }

    @Override
    protected void addCondiment() {
        LOGGER.info("add honey");
    }

    @Override
    protected Beverage ready() {
        return new Tea();
    }
}
