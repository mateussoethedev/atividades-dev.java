package entities;

import applications.ImportedProduct;
import applications.Product;
import applications.UsedProduct;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> product = new ArrayList<>();

        System.out.println("Enter number of product: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = input.next().charAt(0);
            input.nextLine();
            System.out.print("name : ");
            String nameProduct = input.nextLine();
            System.out.print("Price : ");
            Double priceProduct = input.nextDouble();
            if (typeProduct == 'i') {
                System.out.println("Customs Fee: ");
                double custmnsFee1 = input.nextDouble();
                ImportedProduct importedProduct = new ImportedProduct(custmnsFee1, nameProduct, priceProduct);
                product.add(importedProduct);
            } else if (typeProduct == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY) ");
                String date = input.next();
                LocalDate data = LocalDate.parse(date, ftm1);
//                input.nextLine();
                product.add(new UsedProduct(data, nameProduct, priceProduct));
            } else {
                Product product1 = new Product(nameProduct, priceProduct);
                product.add(product1);
            }
        }
        System.out.println("");
        System.out.println("PRICE TAGS: ");
        System.out.println("");
        for (Product lista : product) {
            System.out.println(lista.priceTag());
        }


        input.close();
    }
}