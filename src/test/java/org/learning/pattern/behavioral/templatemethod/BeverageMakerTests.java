package org.learning.pattern.behavioral.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.learning.pattern.behavioral.templatemethod.DrinkMode.ONE_SHOT;
import static org.learning.pattern.behavioral.templatemethod.DrinkMode.SIP;

class BeverageMakerTests {

    @Test
    void makeCoffee() {
        BeverageMaker coffeeMaker = new CoffeeMaker();
        Beverage beverage = coffeeMaker.make();
        DrinkMode drink = beverage.drink();
        assertEquals(ONE_SHOT, drink, "Unexpected drink mode");
    }

    @Test
    void makeTea() {
        BeverageMaker coffeeMaker = new TeaMaker();
        Beverage beverage = coffeeMaker.make();
        DrinkMode drink = beverage.drink();
        assertEquals(SIP, drink, "Unexpected drink mode");
    }
}