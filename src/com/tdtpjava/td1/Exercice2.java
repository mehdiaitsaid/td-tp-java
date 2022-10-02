package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        int n, previous = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier :");
        n = scanner.nextInt();
        System.out.println("S(0) = 0");
        for (int i = 1; i <= n; i++) {
            previous *= 3;
            System.out.println("S(" + i + ") = " + previous);
        }

    }
}
