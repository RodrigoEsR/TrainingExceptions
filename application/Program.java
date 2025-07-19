package application;

import Models.entities.Account;
import Models.exceptions.DomainExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        }
        catch (DomainExceptions e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");

        }

        sc.close();
    }
}