package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        int choice; // factorial if is 1 , sum if 2 and 0 to exit
        int n = 0;
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Entrez 1 pour calculer la somme, 2 pour la factorielle et 0 pour quitter: ");
            choice = scanner.nextInt();
//            System.out.println("");
            if (choice != 0) {
                System.out.print("Entrez un entier :");
                n = scanner.nextInt();
                if (choice == 1) {
                    for (int i = 0; i <= n; i++) {
                        s += i;
                    }
                    System.out.println("La somme  : " + s);

                } else {

                    s = 1;
                    for (int i = 1; i <= n; i++) {
                        s *= i;
                    }
                    System.out.println("La factorielle  : " + s);
                }
            }


            s = 0;
            n = 0;

        } while (choice != 0);


    }
}
