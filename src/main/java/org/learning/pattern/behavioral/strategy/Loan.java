package org.learning.pattern.behavioral.strategy;

import java.util.function.DoubleFunction;

public class Loan {

    private Loan() {
        throw new InstantiationError("Utility class cannot be instantiate");
    }

    public static double calculateInterestLoanWithStrategyPattern(InterestLoanCalculatorStrategy interestLoanCalculatorStrategy,
                                                                  double loanAmount) {
        if(interestLoanCalculatorStrategy == null){
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        return interestLoanCalculatorStrategy.calculateInterest(loanAmount);
    }

    public static double calculateInterestLoanWithFunction(DoubleFunction<Double> interestLoanCalculatorFunction,
                                                           double loanAmount){
        if(interestLoanCalculatorFunction == null){
            throw new IllegalArgumentException("Function cannot be null");
        }
        return interestLoanCalculatorFunction.apply(loanAmount);
    }
}
