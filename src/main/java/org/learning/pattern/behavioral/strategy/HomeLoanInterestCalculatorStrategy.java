package org.learning.pattern.behavioral.strategy;

import static org.learning.pattern.behavioral.strategy.InterestPercentage.HOME;

public class HomeLoanInterestCalculatorStrategy implements InterestLoanCalculatorStrategy {
    @Override
    public double calculateInterest(double loanAmount) {
        return loanAmount * HOME.percentage;
    }
}
