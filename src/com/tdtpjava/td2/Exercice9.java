package com.tdtpjava.td2;

public class Exercice9 {

    public static void triSelection(int[] tab)
    {
        for (int i = 0; i < tab.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < tab.length; j++)
            {
                if (tab[j] < tab[index]){
                    index = j;
                }
            }

            int min = tab[index];
            tab[index] = tab[i];
            tab[i] = min;
        }
    }

    static void triBulle(int[] tab)
    {
        int taille = tab.length;
        int tmp = 0;
        for(int i=0; i < taille; i++)
        {
            for(int j=1; j < (taille-i); j++)
            {
                if(tab[j-1] > tab[j])
                {
                    tmp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = tmp;
                }

            }
        }
    }

    static void displayTab(int[] tab)
    {
        for (int j : tab) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr ={84, 8, 1, 43, 5, 55};
        int[] arr2 ={84, 8, 1, 43, 5, 55};

        System.out.println("---Avant le tri a bulle---");
        displayTab(arr);
        triBulle(arr);
        System.out.println("---Apres le tri a bulle---");
        displayTab(arr);

        System.out.println("---Avant le tri par sélection---");
        displayTab(arr2);
        triBulle(arr2);
        System.out.println("---Apres le tri par sélection---");
        displayTab(arr2);
    }
}
