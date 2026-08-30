package src.secao12_Enumeracao.exemple.Program;

import src.secao12_Enumeracao.exemple.Entities.Department;
import src.secao12_Enumeracao.exemple.Entities.HourContract;
import src.secao12_Enumeracao.exemple.Entities.Worker;
import src.secao12_Enumeracao.exemple.Entities_enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        print("Enter department's name: ");
        String department = sc.nextLine();

        println("Enter worker data");
        print("Name: ");
        String name = sc.nextLine();

        print("Level: ");
        String level = sc.nextLine();

        print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        print("How many contracts to this worker? ");
        int contracts = sc.nextInt();

        for(int i = 1; i <= contracts; i++){
            println("Enter contract #" + i + " data:");
            print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            print("Value per hour: ");
            double value = sc.nextDouble();

            print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, value, hours);
            worker.addContract(contract);
        }

        print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        println("Name: "+ worker.getName());
        println("Department: "+ worker.getDepartment().getName());

        double income = worker.income(year, month);
        println("Income for "+ monthAndYear + ": " + String.format("%.2f", income));
    }

    public static void println(String text){
        System.out.println(text);
    }

    public static void print(String text){
        System.out.print(text);
    }
}

