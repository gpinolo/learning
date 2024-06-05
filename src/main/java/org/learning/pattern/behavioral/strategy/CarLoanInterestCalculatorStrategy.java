package org.learning.pattern.behavioral.strategy;

import static org.learning.pattern.behavioral.strategy.InterestPercentage.CAR;

public class CarLoanInterestCalculatorStrategy implements InterestLoanCalculatorStrategy {
    @Override
    public double calculateInterest(double loanAmount) {
        return loanAmount * CAR.percentage;
    }
}
