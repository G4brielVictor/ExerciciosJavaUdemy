package src.secao8_POO.ex02.entities;

public class Employee {
    public String name;
    public double grossSalary; //6000
    public double tax;

    public double NetSalary(){ //5000
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
         grossSalary += grossSalary * percentage / 100;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", NetSalary());
    }
}
