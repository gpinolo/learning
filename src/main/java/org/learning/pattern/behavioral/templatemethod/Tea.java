package org.learning.pattern.behavioral.templatemethod;

public class Tea implements Beverage {
    @Override
    public DrinkMode drink() {
        return DrinkMode.SIP;
    }
}
