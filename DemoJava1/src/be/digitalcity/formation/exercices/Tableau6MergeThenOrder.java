package be.digitalcity.formation.exercices;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tableau6MergeThenOrder {
    public static void main(String[] args) {

        System.out.println("Quelle taille de tableau souhaitez vous avoir pour le tableau 1 ?");
        Scanner recup = new Scanner(System.in);
        int taille = recup.nextInt();
        int[] tabAOrdonner = generates(taille);

        System.out.println("Quelle taille de tableau souhaitez vous avoir pour le tableau 2 ?");
        taille = recup.nextInt();
        int[] tabAOrdonner2 = generates(taille);
        System.out.println("Les deux tableaux combinés puis ordonnés est:");
        afficherTableau(ordonner(combine(tabAOrdonner,tabAOrdonner2)));

    }

    private static int[] generates(int taille)
    {
        int[] tableau = new int[taille];
        while (taille-- > 0)
            tableau[tableau.length - taille - 1] = ThreadLocalRandom.current().nextInt(-50, 50);
        System.out.println("Le tableau généré est:");
        afficherTableau(tableau);
        return tableau;
    }

    private static void afficherTableau(int[] tableau) {
        int i = -1;
        System.out.print("[");
        while (++i < tableau.length)
            System.out.print(tableau[i] + (((i == (tableau.length - 1)) ? "" : ",")));
        System.out.println("]");
    }

    private static int[] combine(int[] tab1, int[] tab2) {
        int[] tabFinal = new int[(tab1.length + tab2.length)];
        boolean endingPoint = true;
        int index = -1;
        while (++index < tabFinal.length)
            tabFinal[index] = (index < tab1.length) ? tab1[index] : tab2[index - tab1.length];
        return tabFinal;
    }

    private static int[] ordonner(int[] tableau)
    {
        int n;
        int etape = 0;
        int swapValue = 0;
        int indice = 0;
        while (tableau.length > etape++) {
            n = -1 + (etape - 1);
            swapValue = tableau[etape - 1];
            while (++n < tableau.length) {
                if (tableau[n] < swapValue) {
                    swapValue = tableau[n];
                    indice = n;
                }
            }
            tableau[indice] = (tableau[etape - 1] != swapValue) ? tableau[etape - 1] : tableau[indice];
            tableau[etape - 1] = swapValue;
        }
        return tableau;
    }
}
