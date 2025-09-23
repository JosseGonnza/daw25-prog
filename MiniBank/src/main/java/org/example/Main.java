package org.example;

import java.util.Scanner;

public class Main {
    private static final double INTEREST_RATE = 0.02;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Account myAccount = new Account("", 0.00);

        System.out.println("Nombre de la cuenta bancaria: ");
        myAccount.accountName = scanner.nextLine();

        while(true) {
            System.out.println("Saldo inicial: ");
            if (scanner.hasNextDouble()) {
                myAccount.initialBalance = scanner.nextDouble();
                if (myAccount.initialBalance < 0) {
                    System.out.println("La cantidad especificada no es correcta. ");
                } else {
                    break;
                }
            } else {
                scanner.next();
                System.out.println("Debe proporcionar una cantidad. ");
            }
        }


        while (true) {
            System.out.println("\nElige una opción:\n " +
                    "1. Ingresar dinero.\n " +
                    "2. Retirar dinero.\n " +
                    "3. Ver saldo.\n " +
                    "4. Ver saldo con interés.\n " +
                    "5. Salir.\n ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    handleDeposit(myAccount);
                    break;
                case 2:
                    handleWithdraw(myAccount);
                    break;
                case 3:
                    handleShowBalance(myAccount);
                    break;
                case 4:
                    handleShowBalanceWithInterest(myAccount);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida");;
                    break;
            }
            System.out.println(" ");
        }
    }

    public static void handleDeposit(Account account) {
        System.out.println("Qué cantidad desea depositar? ");
        double amount = scanner.nextDouble();
        if (account.deposit(amount)) {
            System.out.println("✅ Depósito exitoso! Nuevo saldo: " + account.getBalance());
        } else {
            System.out.println("❌ Error: Ingrese una cantidad válida");
        }
    }

    public static void handleWithdraw(Account account) {
        System.out.println("Qué cantidad desea retirar? ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("✅ Retiro exitoso! Nuevo saldo: " + account.getBalance());
        } else {
            System.out.println("❌ Error: Retire una cantidad válida");
        }
    }

    public static void handleShowBalance(Account account) {
        System.out.println("El saldo actual es de: " + account.getBalance());
    }

    public static void handleShowBalanceWithInterest(Account account) {
        System.out.println("El saldo con intereses es de: " + calculateBalanceWithAnnualInterest(account.getBalance()));
    }

    public static double calculateBalanceWithAnnualInterest(double balance) {
        return (1 + INTEREST_RATE) * balance;
    }
}