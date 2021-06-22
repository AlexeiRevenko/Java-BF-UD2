package be.digitalcity.formation.exercices;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Tableau6 {
    public static void main(String[] args) {

        System.out.println("Quelle taille de tableau souhaitez vous avoir pour le tableau 1 ?");
        Scanner recup = new Scanner(System.in);
        int taille = recup.nextInt();
        int[] tabAOrdonner = generates(taille);

        System.out.println("Quelle taille de tableau souhaitez vous avoir pour le tableau 2 ?");
        taille = recup.nextInt();
        int[] tabAOrdonner2 = generates(taille);
        System.out.println("Les deux tableaux combinés puis ordonnés nous donnent:");


        int[] tabFinal = new int[(tabAOrdonner.length + tabAOrdonner2.length)];
        int minValue = Integer.MAX_VALUE;
         int indice;
         int position;


         for(int etape = 1 ; etape <= tabFinal.length ; etape++){
            indice = 1;
            position = 0;
             //for (int parcourir : new int [tabAOrdonner + tabAOrdonner2])
            for (int parcourir : ((position < tabAOrdonner.length) ? tabAOrdonner: tabAOrdonner2))
            {
                System.out.println("minValue "+minValue + " parcourir " + parcourir);
                if(minValue > parcourir && checkIfNotIn(tabFinal,parcourir, etape))
                {
                    minValue = parcourir;
                    indice = 1;
                }
                else if (minValue == parcourir)
                    indice++;
                position++;
                System.out.println("position " + position + " parcourir "+parcourir + " minValue " + minValue);
                if(position == tabAOrdonner.length)
                    System.out.println("===================================================");
            }

           /* for(int position = 0 ; position<tabAOrdonner.length ; position ++)
            {
                if(minValue > tabAOrdonner[position] && checkIfNotIn(tabFinal,tabAOrdonner[position], etape))
                {
                    minValue = tabAOrdonner[position];
                    indice = 1;
                }
                else if (minValue == tabAOrdonner[position])
                    indice++;
            }

            for(int position = 0 ; position<tabAOrdonner2.length ; position ++) {
                if(minValue > tabAOrdonner2[position] && checkIfNotIn(tabFinal,tabAOrdonner2[position],etape))
                {
                    minValue = tabAOrdonner2[position];
                    indice = 1;
                }
                else if (minValue == tabAOrdonner2[position])
                    indice++;
            }*/
            while(indice > 0) {
                tabFinal[etape - 1 ] = minValue;
                etape = (indice == 1)? etape : etape + 1;
                indice--;
            }
            minValue = Integer.MAX_VALUE;

             afficherTableau(tabFinal);

        }
        afficherTableau(tabFinal);
    }


        private static boolean checkIfNotIn(int[] tab, int i, int etape)
        {
            boolean check = true;
            for(int j = 0; j < (etape - 1); j++)
                if(tab[j] == i)
                    check = false;
            return check;
        }

        private static int[] generates(int taille)
        {
            int[] tableau = new int[taille];
            while (taille-- > 0)
                tableau[tableau.length - taille - 1] = ThreadLocalRandom.current().nextInt(-10, 10);
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
}
