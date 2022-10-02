package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        int  n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier :");
        n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
