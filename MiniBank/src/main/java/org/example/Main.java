package org.example;

import java.util.Scanner;

public class Main {
    private static final double INTEREST_RATE = 0.02;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
                    System.out.println("Qué cantidad desea depositar? ");
                    myAccount.deposit(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Qué cantidad desea sustraer? ");
                    myAccount.withdraw(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Saldo Actual: " + myAccount.initialBalance);
                    break;
                case 4:
                    System.out.println("Saldo con interés anual: " + calculateBalanceWithAnnualInterest(myAccount.initialBalance));
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

    public static double calculateBalanceWithAnnualInterest(double balance) {
        return (1 + INTEREST_RATE) * balance;
    }
}