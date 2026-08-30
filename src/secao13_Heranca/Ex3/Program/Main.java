package src.secao13_Heranca.Ex3.Program;

import src.secao13_Heranca.Ex3.Entities.Enterprise;
import src.secao13_Heranca.Ex3.Entities.Individual;
import src.secao13_Heranca.Ex3.Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Tax payer #" + (i + 1) + " data:");

            System.out.print("Individual or company: ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                TaxPayer individual = new Individual(name, annualIncome, healthExpenditures);
                list.add(individual);
            }
            else if(ch == 'c'){
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();

                TaxPayer enterprise = new Enterprise(name, annualIncome, employees);
                list.add(enterprise);
            }
        }

        System.out.println("\nTAX PAID:");
        double sumTax = 0;
        for(TaxPayer p : list){
            System.out.printf("%s: $ %.2f", p.getName(), p.tax());
            System.out.println();

            sumTax += p.tax();
        }

        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sumTax));
        sc.close();
    }
}
