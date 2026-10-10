import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

         Employee emp = new Employee();

         System.out.print("name :");
            emp.name=sc.nextLine();
         System.out.print("GrossSalary : ");
            emp.grossSalary = sc.nextDouble();
        System.out.print("Tax : ");
            emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.println("Which percentage to increase salary? \"");
        double porcentagem = sc.nextDouble();
        emp.IncreseSalary(porcentagem);

        System.out.println("Update Data : "+ emp);

        sc.close();
    }
}