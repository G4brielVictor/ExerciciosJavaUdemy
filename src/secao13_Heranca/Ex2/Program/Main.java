package src.secao13_Heranca.Ex2.Program;

import src.secao13_Heranca.Ex2.Entities.ImportedProduct;
import src.secao13_Heranca.Ex2.Entities.Product;
import src.secao13_Heranca.Ex2.Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Enter product #" + i + " data: ");

            System.out.print("Common, used or imported (c/u/i)? ");
            char c = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if(c != 'c' && c != 'u' && c != 'i'){
                System.out.println("Invalid input");
                return;
            }

            if(c == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());

                list.add(new UsedProduct(name, price, manufactureDate));
               }

            else if(c == 'i'){
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();

                list.add(new ImportedProduct(name, price, fee));
            }

            else {
                list.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product prods : list) {
            System.out.println(prods.getName() + " $ " + prods.priceTag());
        }
    }
}
