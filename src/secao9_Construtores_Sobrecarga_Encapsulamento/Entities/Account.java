package src.secao9_Construtores_Sobrecarga_Encapsulamento.Entities;

public class Account {
    private final int accountNumber;
    private String name;
    private double balance;

    //Sobrecarga
    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    //Construtor
    public Account(int accountNumber, String name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialBalance);
    }

    //Getter
    public int getAccountNumber() {
        return accountNumber;
    }

    //Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    public String toString() {
        return "Account " + accountNumber + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
    }

}
