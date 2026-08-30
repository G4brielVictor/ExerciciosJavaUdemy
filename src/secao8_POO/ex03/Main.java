package src.secao8_POO.ex03;

import src.secao8_POO.ex03.Entities.Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        stu.name = sc.nextLine();
        stu.grade1 = sc.nextDouble();
        stu.grade2 = sc.nextDouble();
        stu.grade3 = sc.nextDouble();

        System.out.printf("\nFINAL GRADE = %.2f\n", stu.finalGrade());

        if(stu.missingPoints() < 60){
            System.out.println("FAILED");
            System.out.printf("MISSING: %.2f POINTS", stu.missingPoints());
            return;
        }
        System.out.println("PASS");

        sc.close();
    }
}
