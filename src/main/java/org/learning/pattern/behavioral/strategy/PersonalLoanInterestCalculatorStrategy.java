package org.learning.pattern.behavioral.strategy;

import static org.learning.pattern.behavioral.strategy.InterestPercentage.PERSONAL;

public class PersonalLoanInterestCalculatorStrategy implements InterestLoanCalculatorStrategy {
    @Override
    public double calculateInterest(double loanAmount) {
        return loanAmount * PERSONAL.percentage;
    }
}
