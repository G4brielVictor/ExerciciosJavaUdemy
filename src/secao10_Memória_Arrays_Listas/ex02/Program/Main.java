package src.secao10_Memória_Arrays_Listas.ex02.Program;
import src.secao10_Memória_Arrays_Listas.ex02.Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> emps = new ArrayList<>();

        System.out.print("How many employes will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println();
        for(int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            while(hasId(emps, id)){
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            emps.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        //Defino minha variavel do objeto existente e já definido.
        //Stream pega minha lista "emps" e deixa ela em sequencia.
        /*filter filtra, analisa cada Employee, x é o Employee atual ex. Employee[0] = x;
           pega o id daquele Employee atual e compara com a variavel id definida no codigo.
           o lambda indica q Employee na posicao[0] receba o elemento x e faz a comparacao.
           findFirst encontra o primeiro, como os IDs n repetem, é util no codigo
           orElse é caso n tenha um Employee me retorne na variavel emp NULL */
        Employee emp = emps.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for(Employee e : emps){
            System.out.println(e);
        }

    }

    public static Boolean hasId(List<Employee> emps, int id){
        Employee emp = emps.stream().filter(n -> n.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
