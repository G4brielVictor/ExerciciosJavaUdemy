package src.secao14_Exceptions.Ex1.Aplication;

import src.secao14_Exceptions.Ex1.Model.Entities.Account;
import src.secao14_Exceptions.Ex1.Model.Exceptions.BusinessException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter acount data");
            System.out.print("Number: ");
            int number = sc.nextInt();

            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account ac = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();

            System.out.print("Enter the amount for withdraw: ");
            double amount = sc.nextDouble();

            ac.withdraw(amount);
            System.out.printf("New balance: %.2f\n", ac.getBalance());
        }
        catch(BusinessException e){
            System.out.println(e.getMessage());
        }
    }
}
