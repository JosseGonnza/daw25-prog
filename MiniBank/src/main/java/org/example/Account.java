package org.example;

public class Account{
    String accountName;
    double initialBalance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.initialBalance = initialBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            initialBalance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && initialBalance >= amount) {
            initialBalance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return initialBalance;
    }
}

