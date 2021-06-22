import java.util.Scanner;

public class Tableau3 {
    public static void main(String[] args) {
        /*
        Écrire un algorithme demandant à l’utilisateur le nombre de joueurs (max 10 joueurs).
        Ensuite, l’algorithme doit demander à l’utilisateur le score de chaque joueur. Une fois ceci
        fini, il faut afficher la moyenne des scores. Faites de même en C#.
        */

        int joueurs, i = 0;
        float moyenne = 0;
        Scanner recup = new Scanner(System.in);

        System.out.println("Veuillez entrer le nombre de joueurs (entier positif et maximum 10 joueurs !)");
        joueurs = recup.nextInt();
        while (joueurs > 10 || joueurs < 0) {
            System.out.println("Le nombre de joueurs que vous avez entré n'est pas correct ! \n " +
                    "Veuillez entre un nombre de joueurs entre 1 et 10.");
            joueurs = recup.nextInt();
        }

        if (joueurs != 0) {
            int[] tableau = new int[joueurs];
            System.out.println("Nous allons calculer la moyenne des scores des joueurs.");
            System.out.println("Pour cela, veuillez entrer les scores des différents joueurs.");

            while (joueurs > i++) {
                System.out.println("Entrez le score du joueur " + i);
                tableau[i - 1] = recup.nextInt();
                while (tableau[i - 1] < 0) {
                    System.out.println("Vous avez entré un score négatif. \n " +
                            "Veuillez à nouveau entrer un score pour le joueur " + i);
                    tableau[i - 1] = recup.nextInt();
                }
                moyenne = moyenne + tableau[i - 1];
            }
            System.out.println("La moyenne des scores des joueurs est " + moyenne / joueurs);
        } else {
            System.out.println("Vous n'avez pas de joueurs, il n'y a pas de moyenne à calculer, on s'arrête donc là. ");
        }
    }
}
