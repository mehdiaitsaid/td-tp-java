package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {

        int  n0 = 0 , n1 = 1 , n2 , n = 0;
        Scanner scanner = new Scanner(System.in);



        System.out.print("Entrez le premier entier :");
        n = scanner.nextInt();

        System.out.println("F(0) = 0");
        System.out.println("F(1) = 1");
        for(int i=2; i<n; ++i)
        {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            System.out.println("F("+ i + ") = "+n2);
        }


    }
}
