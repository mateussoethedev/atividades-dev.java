import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dt2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        System.out.println("Enter Client Data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date : ");
        String birthDay = sc.nextLine();
        Date date = dt1.parse(birthDay);
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Client client = new Client(name, email, dt1.parse(birthDay));
        Order order = new Order(new Date(), status, client);


        System.out.println("How many itens to this order ?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Product Name: ");
            String productName = sc.next();
            System.out.print("Product Price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Product Quantity: ");
            int productQuantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(productQuantity, productPrice, product);
            order.AddItem(item);
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: ");
        System.out.println(order);


        sc.close();
    }
}