package org.learning.pattern.behavioral.strategy;

import org.junit.jupiter.api.Test;

import java.util.function.DoubleFunction;

import static org.junit.jupiter.api.Assertions.*;
import static org.learning.pattern.behavioral.strategy.InterestPercentage.*;

class LoanTests {

    private static final int HOME_LOAN_AMOUNT = 80000;
    private static final double HOME_LOAN_INTEREST = HOME_LOAN_AMOUNT * HOME.percentage;
    private static final int PERSONAL_LOAN_AMOUNT = 8000;
    private static final double PERSONAL_LOAN_INTEREST = PERSONAL_LOAN_AMOUNT * PERSONAL.percentage;
    private static final int CAR_LOAN_AMOUNT = 5000;
    private static final double CAR_LOAN_INTEREST = CAR_LOAN_AMOUNT * CAR.percentage;

    /**
     * {@link Loan#calculateInterestLoanWithStrategyPattern(InterestLoanCalculatorStrategy, double)} tests
     */

    @Test
    void calculateHomeInterestLoanWithStrategyPattern() {
                double interest = Loan.calculateInterestLoanWithStrategyPattern(new HomeLoanInterestCalculatorStrategy(), HOME_LOAN_AMOUNT);
        assertEquals(HOME_LOAN_INTEREST, interest, "Unexpected interest amount");
    }

    @Test
    void calculatePersonalInterestLoanWithStrategyPattern() {
        double interest = Loan.calculateInterestLoanWithStrategyPattern(new PersonalLoanInterestCalculatorStrategy(), PERSONAL_LOAN_AMOUNT);
        assertEquals(PERSONAL_LOAN_INTEREST, interest, "Unexpected interest amount");
    }

    @Test
    void calculateCarInterestLoanWithStrategyPattern() {
        double interest = Loan.calculateInterestLoanWithStrategyPattern(new CarLoanInterestCalculatorStrategy(), CAR_LOAN_AMOUNT);
        assertEquals(CAR_LOAN_INTEREST, interest, "Unexpected interest amount");
    }

    /**
     * {@link Loan#calculateInterestLoanWithFunction(DoubleFunction, double)} tests
     */

    @Test
    void calculateHomeInterestLoanWithFunction() {
        double interest = Loan.calculateInterestLoanWithFunction(value -> value * HOME.percentage, HOME_LOAN_AMOUNT);
        assertEquals(HOME_LOAN_INTEREST, interest, "Unexpected interest amount");
    }

    @Test
    void calculatePersonalInterestLoanWithFunction(){
        double interest = Loan.calculateInterestLoanWithFunction(value -> value * PERSONAL.percentage, PERSONAL_LOAN_AMOUNT);
        assertEquals(PERSONAL_LOAN_INTEREST, interest, "Unexpected interest amount");
    }

    @Test
    void calculateCarInterestLoanWithFunction(){
        double interest = Loan.calculateInterestLoanWithFunction(value -> value * CAR.percentage, CAR_LOAN_AMOUNT);
        assertEquals(CAR_LOAN_INTEREST, interest, "Unexpected interest amount");
    }
}