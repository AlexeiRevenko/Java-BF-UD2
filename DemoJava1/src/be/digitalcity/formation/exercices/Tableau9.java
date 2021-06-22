package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class Tableau9 {
    public static void main(String[] args) {
        System.out.println("Veuillez entrer dix valeurs successives (entières) pour constituer un tableau.");
        int tab[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10 ; i++)
        {
            System.out.println("Veillez entrer l'élément "+(i+1) +" du tableau");
            tab[i] = sc.nextInt();
        }
        System.out.println("\nLe tableau que vous avez constitué est :");
        afficherTableau(tab);
        System.out.println("La valeur minimale que vous avez entrée dans le tableau est : ");
        findMin(tab);
    }

    private static void afficherTableau(int[] tableau) {
        int i = -1;
        System.out.print("[");
        while (++i < tableau.length)
            System.out.print(tableau[i] + (((i == (tableau.length - 1)) ? "" : ",")));
        System.out.println("]");
    }
    private static void findMin(int[] tableau) {
        int minimum = 0;
        for(int j = 0 ; j < tableau.length ; j++)
            minimum = (minimum > tableau[j]) ? tableau[j] : minimum;
        System.out.println(minimum);
    }
}
