import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        for ( int a=0 ; a<N ; a++){
            if( a % 2 == 1){
                System.out.println(a);
            }
        }
    }
}