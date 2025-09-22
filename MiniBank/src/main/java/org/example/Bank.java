package org.example;

public class Bank{
    public final double INTEREST_RATE = 0.02;

    public double calculateBalanceWithAnnualInterest(double balance) {
        return (balance * INTEREST_RATE) + balance;
    }
}
