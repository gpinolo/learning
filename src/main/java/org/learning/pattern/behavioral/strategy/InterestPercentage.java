package org.learning.pattern.behavioral.strategy;

public enum InterestPercentage {
    HOME(0.03), PERSONAL(0.05), CAR(0.04);

    public final double percentage;

    InterestPercentage(double percentage) {
        this.percentage = percentage;
    }
}
