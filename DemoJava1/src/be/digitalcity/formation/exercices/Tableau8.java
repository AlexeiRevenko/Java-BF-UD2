package be.digitalcity.formation.exercices;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tableau8 {
    public static void main(String[] args) {

        System.out.println("Quelle taille de tableau souhaitez vous avoir ?");
        Scanner recup = new Scanner(System.in);
        int taille = recup.nextInt();
        System.out.println("Entrez l'entier minimal possible dans votre tableau?");
        int min = recup.nextInt();
        System.out.println("Entrez l'entier maximal possible dans votre tableau?");
        int max = recup.nextInt();
        int[] tabAOrdonner = generates(taille, min, max);

        System.out.println("Un tableau de taille "+taille+" à été généré, les valeurs sont aléatoires");
        char reponse;
        boolean check = false;
        do {
            System.out.println("Voulez vous afficher le tableau ? \n- Tapez 'O' si oui\n- Tapez 'N' si non");
            reponse = recup.next().charAt(0);
            if(reponse != 'O' && reponse != 'N')
                System.out.println("Vous n'avez pas entré un des deux choix proposés ! Veuillez réessayer");
            else
                check = true;
        }while(!check);
        if(reponse == 'O')
            afficherTableau(tabAOrdonner);
        do {

            System.out.println("Entrez un entier compris dans l'intervalle cité précédemment et nous allons vérifier si il est dans le tableau généré.");
            taille = recup.nextInt();
            check = checkIfIn(tabAOrdonner, taille);
            if(!check)
                System.out.println("Le nombre que vous avez entré n'est pas dans le tableau.");
            System.out.println("Voulez vous afficher le tableau ? \n- Tapez 'O' si oui\n- Tapez 'N' si non");
            reponse = recup.next().charAt(0);
            if(reponse != 'O' && reponse != 'N')
                System.out.println("Vous n'avez pas entré un des deux choix proposés ! Veuillez réessayer.");

        }while(reponse == 'O');
        System.out.println("Merci d'avoir joué :)");
    }

    private static boolean checkIfIn(int[] tab, int valeur)
    {
        boolean verif = false;
        for(int i = 0 ; i < tab.length ; i++)
            if(tab[i] == valeur) {
                System.out.println("Le nombre que vous avez entré se trouve dans le tableau à la position " + (i + 1));
                verif = true;
            }
        return verif;
    }

    private static int[] generates(int taille, int min, int max)
    {
        int[] tableau = new int[taille];
        while (taille-- > 0)
            tableau[tableau.length - taille - 1] = ThreadLocalRandom.current().nextInt(min, max);
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
