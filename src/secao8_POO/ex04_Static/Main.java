package src.secao8_POO.ex04_Static;

import secao8_POO.ex04_Static.Util.CurrencyConverter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the price? ");
        var price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dolar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.Converter(price));

        sc.close();
    }
}
