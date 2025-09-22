package org.example;

public class Account{
    String holderName;
    double balance;

    public Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit (double amount) {
        System.out.println("Sen intentaron depositar: " + amount);
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("No se pudo realizar la operación.");
        }
    }

    public void withdraw (double amount) {
        System.out.println("Sen intentaron sustraer: " + amount);
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("No se pudo realizar la operación.");
        }
    }
}
