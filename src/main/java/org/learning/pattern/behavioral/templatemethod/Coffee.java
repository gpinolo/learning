package org.learning.pattern.behavioral.templatemethod;

public class Coffee implements Beverage {
    @Override
    public DrinkMode drink() {
        return DrinkMode.ONE_SHOT;
    }
}
