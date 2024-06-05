package org.learning.pattern.behavioral.templatemethod;

import java.util.logging.Logger;

public abstract class BeverageMaker {

    private static final Logger LOGGER = Logger.getLogger(BeverageMaker.class.getName());

    public Beverage make(){
        boilWater();
        prepare();
        pourInCup();
        addCondiment();
        return ready();
    }

    protected abstract void prepare();

    protected abstract void addCondiment();

    protected abstract Beverage ready();

    private void boilWater() {
        LOGGER.info("boil water");
    }

    private void pourInCup() {
        LOGGER.info("pour in cup");
    }
}
