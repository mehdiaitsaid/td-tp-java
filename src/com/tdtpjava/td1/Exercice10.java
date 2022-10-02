package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        float[] notes = new float[100];
        int nbrNotes = 0;
        float note , avg = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Entrez une note négative ou supérieur à 20 pour arrêter l'insertion -------- ");
        do {
            System.out.print("Entrez une note :");
            note  = scanner.nextFloat();
            if (note >= 0 && note <= 20){
                notes[nbrNotes] = note;
                avg += note;
                nbrNotes ++;
            }
        }while (!(nbrNotes > 0 && (note < 0 || note > 20)));


        System.out.print("Les note :");
        for (int i = 0; i < nbrNotes; i++) {
            System.out.print(notes[i]  + " ");
        }

        avg = avg/nbrNotes;
        System.out.print("\nLa moyenne est : " +avg + " ");
        if (avg > 14)
            System.out.println("(Très Bien)");
        else if (avg > 12)
            System.out.println("(Bien)");
        else if (avg > 10)
            System.out.println("(Passable)");
        else  System.out.println("(Non admis)");

    }
}
