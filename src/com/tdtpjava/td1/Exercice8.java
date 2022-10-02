package com.tdtpjava.td1;

public class Exercice8 {
    public static void main(String[] args) {
        int[] table = new int[50];

        for (int i = 0; i < 50; i++) {
            table[i] = 3 + (int)(Math.random() * ((21 - 3) + 1));
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("Table[" + i + "] = " + table[i]);
        }


    }
}
