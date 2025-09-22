package org.example;

public class Account{
    String holderName;
    double balance;

    public Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit (double amount) {
        System.out.println("Se intentó depositar: " + amount);
        if (amount > 0) {
            balance += amount;
            System.out.println("Balance actual: " + balance);
        } else {
            System.out.println("No se pudo realizar la operación.");
        }
    }

    public void withdraw (double amount) {
        System.out.println("Se intentó sustraer: " + amount);
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Balance actual: " + balance);
        } else {
            System.out.println("No se pudo realizar la operación.");
        }
    }
}

