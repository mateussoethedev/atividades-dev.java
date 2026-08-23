import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Atividade{
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employees> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int emp = sc.nextInt();

        for (int x=0; x<emp ; x++){
            System.out.println("Employee #" + (x+1));

        System.out.println("Id : ");
        int ID = sc.nextInt();
        sc.nextLine();

        boolean idExist = false;
            for (Employees empl : list){
                if (empl.getId() == ID){
                    idExist = true;
                    System.out.println(idExist);
                }
            }
            if (idExist){
                System.out.println("This id already exits");
                x--;
                continue;
            }

            System.out.println("Name: ");
            String NAME = sc.nextLine();

            System.out.println("Salary: ");
            double SALARY = sc.nextDouble();

            list.add(new Employees(ID,NAME,SALARY));
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int salaryinc = sc.nextInt();
        for (Employees empl : list) {
            if (empl.getId() == salaryinc) {
                System.out.println("Enter the percentage: ");
                double percentage = sc.nextDouble();
                empl.increaseSalary(percentage);
            }
        }

        System.out.println("List of Employees");
        for (Employees lis : list) {
            System.out.println(lis);
        }

        sc.close();
    }

}