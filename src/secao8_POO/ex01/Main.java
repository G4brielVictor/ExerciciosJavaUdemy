package src.secao8_POO.ex01;

import src.secao8_POO.ex01.entities.Rectangle;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", rec.area());
        System.out.printf("PERIMETER = %.2f\n", rec.perimeter());
        System.out.printf("DIAGONAL = %.2f", rec.diagonal());

        sc.close();
    }
}
