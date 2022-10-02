package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice9 {

    public static void main(String[] args) {
        int  n = 0, j =0;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Entrez un entier strictement positif  :");
            n = scanner.nextInt();
        } while (n < 1);

        System.out.print("Diviseurs propres sans répétition de 13 : ");

        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0){
                System.out.print(i + " ");
                isPrime = false;
                j++;
            }
        }
        if (isPrime) System.out.println("aucun ! Il est premier");
        else System.out.println(" (soit "+ j +" diviseurs propres)");



    }
}
