package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account myAccount = new Account("Jose", 0);
        Bank myBank = new Bank();

        System.out.println("Nombre de la cuenta bancaria: ");
        myAccount.holderName = scanner.nextLine();

        while(true) {
            System.out.println("Saldo inicial: ");
            if (scanner.hasNextDouble()) {
                myAccount.balance = scanner.nextDouble();
                if (myAccount.balance < 0) {
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
                    System.out.println("Saldo Actual: " + myAccount.balance);
                    break;
                case 4:
                    System.out.println("Saldo con interés anual: " + myBank.calculateBalanceWithAnnualInterest(myAccount.balance));
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
}