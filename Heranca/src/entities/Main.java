package entities;

import application.Account;
import application.BusinessAccount;
import application.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

//        Account acc = new Account(1001,"Alex", 0.0);
//        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0, 500.00);
//
//        //UPCASTING
//
//        Account acc1 = bacc;
//        Account acc2 = new BusinessAccount(1003,"bob",0.0, 200.0);
//        Account acc3 = new SavingsAccount(1004,"Ana", 0.0,0.01);
//
//        // DOWNCASTING
//        BusinessAccount acc4 = (BusinessAccount) acc2;
//        acc4.loan(100.0);
//
//        //BusinessAccount acc5 = (BusinessAccount) acc3;
//        if (acc3 instanceof BusinessAccount ) {
//            BusinessAccount acc5 = (BusinessAccount) acc3;
//            acc5.loan(200.0);
//            System.out.println("Loan");
//        }
//            if (acc3 instanceof SavingsAccount ){
//                SavingsAccount acc5 = (SavingsAccount) acc3;
//                acc5.updateBalance();
//                System.out.println("Update");
//            }

        // Descontando a taxa ( Conta Normal )
        Account acc1 = new Account(1001,"Alex", 1000.0);
        acc1.withDraw(200);
        System.out.println(acc1.getBalance());


        // Sem descontar a taxa ( Conta Poupança )
        Account acc2 = new SavingsAccount(1002,"Maria", 1000.0, 0.01);
        acc2.withDraw(200);
        System.out.println(acc2.getBalance());
        input.close();

        // Descontando um extra por ser Busines ( Empesarial )
        Account acc3 = new BusinessAccount(1003,"Bob", 1000.0, 500.00);
        acc3.withDraw(200);
        System.out.println(acc3.getBalance());
        input.close();
    }
}