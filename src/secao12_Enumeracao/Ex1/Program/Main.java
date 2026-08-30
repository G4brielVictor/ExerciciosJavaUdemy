package src.secao12_Enumeracao.Ex1.Program;

import src.secao12_Enumeracao.Ex1.Entities.Client;
import src.secao12_Enumeracao.Ex1.Entities.Order;
import src.secao12_Enumeracao.Ex1.Entities.OrderItem;
import src.secao12_Enumeracao.Ex1.Entities.Product;
import src.secao12_Enumeracao.Ex1.Entities_enum.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        println("Enter client data:");
        print("Name: ");
        String name = sc.nextLine();

        print("Email: ");
        String email = sc.next();

        print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        sc.nextLine();

        println("Enter order data: ");
        print("Status: ");
        String status = sc.nextLine();

        print("How many items to this order? ");
        int items = sc.nextInt();
        sc.nextLine();

        Order order = new Order(OrderStatus.valueOf(status), new Client(name, email, birthDate));

        for(int i = 1; i <= items; i++) {
            println("Enter #" + i + " item data: ");
            print("Product name: ");
            String productName = sc.nextLine();

            print("Product price: ");
            double productPrice = sc.nextDouble();

            print("Quantity: ");
            int productQuantity = sc.nextInt();

            OrderItem item = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
            order.addItem(item);
            sc.nextLine();
        }

        println("ORDER SUMMARY: ");
        println("Order moment: " + sdf2.format(order.getMoment()));
        println("Order status: " + order.getStatus());
        println("Client: "+ order.getClient().getName()+ " " + "(" + order.getClient().getEmail() + ")" + " - " + order.getClient().getEmail());

        println("Order items: ");
        for(OrderItem item: order.getItems()) {
            println(item.toString());
        }
        print("Total price: " + String.format("%.2f", order.total()));
    }

    public static void print(String s){
        System.out.print(s);
    }

    public static void println(String s){
        System.out.println(s);
    }
}
