package src.secao10_Memória_Arrays_Listas.ex01.Aplication;

import src.secao10_Memória_Arrays_Listas.ex01.Entities.Guest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Guest[] vect = new Guest[10];

        System.out.print("How many rooms will be rented? ");
        int rooms = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= rooms; i++){
            System.out.printf("Rent #%d:\n", i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            vect[roomNumber] = new Guest(name, email, roomNumber);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
    }
}
