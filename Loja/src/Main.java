import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.ImportedProduct;
import entities.products;
import entities.UsedProduct;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<products> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of productsss: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Products #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine(); // limpar buffer
            String name = sc.nextLine();
            System.out.print("Price: ");
            double value = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, value, customsFee));

            } else if (ch == 'u') {
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                sc.nextLine(); // limpar buffer
                String dateStr = sc.nextLine();
                try {
                    Date date = sdf.parse(dateStr);
                    list.add(new UsedProduct(name, value, date));
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Skipping this products.");
                }

            } else {
                list.add(new products(name, value));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (products prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
