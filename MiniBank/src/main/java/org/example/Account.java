package org.example;

public class Account{
    String accountName;
    double initialBalance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.initialBalance = initialBalance;
    }

    public void deposit (double amount) {
        System.out.println("Se intentó depositar: " + amount);
        if (amount > 0) {
            initialBalance += amount;
            System.out.println("Balance actual: " + initialBalance);
        } else {
            System.out.println("No se pudo realizar la operación.");
        }
    }

    public void withdraw (double amount) {
        System.out.println("Se intentó sustraer: " + amount);
        if (amount > 0 && initialBalance >= amount) {
            initialBalance -= amount;
            System.out.println("Balance actual: " + initialBalance);
        } else {
            System.out.println("No se pudo realizar la operación.");
        }
    }
}

