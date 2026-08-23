import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Mateus");
        list.add("Marco");
        list.add("alex");
        list.add("Anna");
        list.add(2,"Henrique");

        System.out.println(list.size());
//        list.remove("Anna");
//        list.remove(1);

        //remover da lista a tudo que começa com o M (no caso e o M maiusculo)
         list.removeIf(x -> x.charAt(0) == 'M');
        //Deixar na lista tudo que começa com M ( no caso o M maiusculo )
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("----------");
        System.out.println(result);
        System.out.println("----------");
        System.out.println("Index of bob: " + list.indexOf("Mateus"));
        System.out.println("Index of bob: " + list.indexOf("mateus"));
        System.out.println("----------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
        System.out.println("----------");


        for (String x : list ) {
            System.out.println(x);
        }


        sc.close();
    }
}