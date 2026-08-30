package src.secao13_Heranca.Ex1.Program;

import src.secao13_Heranca.Ex1.Entities.Employee;
import src.secao13_Heranca.Ex1.Entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            print("Enter employee " + i + "data: ");
            print("Outsourced (Y/N): ");
            char s = sc.next().charAt(0);
            if(s != 'Y' && s != 'N') {
                println("\nInvalid input");
                return;
            }

            print("Name: ");
            String name = sc.next();

            print("Hours: ");
            int hours = sc.nextInt();

            print("Value per hour: ");
            Double valuePerH = sc.nextDouble();

            if(s == 'Y'){
                print("Additional charge per hour: ");
                Double charge = sc.nextDouble();

                list.add(new OutSourcedEmployee(name, hours, valuePerH, charge));
            }

            else {
                Employee emp = new Employee(name, hours, valuePerH);
                list.add(emp);
            }
        }


        println("");
        println("PAYMENTS");
        for(Employee emp: list) {
            println(emp.getName() + " - " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }

    public static void print(String s){
        System.out.print(s);
    }

    public static void println(String s){
        System.out.println(s);
    }
}
