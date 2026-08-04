import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String [] args ){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i=0; i<n; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa : ");
            System.out.println("Nome : ");
            nomes[i] = sc.next();
            System.out.println("Idade : ");
            idade[i] = sc.nextInt();
            System.out.println("Altura : ");
            altura[i] = sc.nextDouble();
        }

        double soma =0;
        for (int i=0; i<n; i++){
            soma += altura[i];
        }
        double mdAltura = soma / n;
            System.out.printf("Altura Media : %.2f%n", mdAltura);

        int count=0;
        for (int i=0; i<n; i++) {
            if ( idade[i] < 16 ){
                count++;
            }
        }
        double porcent = count * 100.0 / n;
        System.out.print("");
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcent);

        int nmMenor=0;
        for (int i=0; i<n; i++){
            if (idade[i] < 16 ) {
                System.out.println(nomes[i]);
            }
        }
       sc.close();
    }
}