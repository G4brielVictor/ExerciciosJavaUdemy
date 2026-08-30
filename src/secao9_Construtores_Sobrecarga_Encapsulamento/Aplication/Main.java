package src.secao9_Construtores_Sobrecarga_Encapsulamento.Aplication;
import src.secao9_Construtores_Sobrecarga_Encapsulamento.Entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char letter = sc.next().charAt(0);

        if(letter == 'y') {
            System.out.print("Enter initial deposit value: ");
            account = new Account(accountNumber, name, sc.nextDouble());
        }
        else {
            account = new Account(accountNumber, name);
        }

        System.out.println("\nAccount data:\n" + account);

        System.out.print("\nEnter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data:\n" +  account);

        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.print("Updated account data:\n" +  account);

        sc.close();
    }
}
