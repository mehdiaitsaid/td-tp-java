package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier :");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i ==  0){
                System.out.println(n + " est divisé par : " + i);
            }
        }
    }
}
