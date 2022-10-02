package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        int  n1 , n2 , pgcd = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier :");
        n1 = scanner.nextInt();

        System.out.print("Entrez le deuxième entier :");
        n2 = scanner.nextInt();


        for(int i=1; i <= n1 && i <= n2; i++)
        {
            if(n1% i==0 && n2%i==0)
                pgcd = i;
        }
        System.out.printf("PGCD de %d et %d est: %d", n1, n2, pgcd);
    }
}
