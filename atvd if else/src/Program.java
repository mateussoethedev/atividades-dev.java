import java.util.Locale;
import java.util.Scanner;
public class Program{
    public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);


            System.out.print("Type one value : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ( a % b == 0 || b % a == 0){
                System.out.print("This value is Multiple ");
            } else{
                    System.out.print("This value isn't Multiple ");
                }
                sc.close();
    }
}