import java.util.Scanner;

public class Tableau4 {
    public static void main(String[] args) {


        Scanner recup = new Scanner(System.in);
        System.out.println("Indiquer la taille du tableau d'ENTIER à initialiser.");
        int taille = recup.nextInt();
        int[] tableau = new int[taille];
        while(taille-- != 0){
            System.out.println("Veuillez entrer l'élément " + (tableau.length - taille) +" du tableau");
            System.out.println("La taille du tableau "+ (tableau.length - taille));
            tableau[tableau.length - taille - 1] = recup.nextInt();
        }

        System.out.println("Le tableau que vous avez entré est:");
        System.out.print("[");

        while(++taille < tableau.length)
                System.out.print(tableau[taille] + (((taille + 1) == tableau.length)?"":","));
            System.out.println("]");

        System.out.println("Nous allons maintenant inverser les tableaux");
        int[] tabInverse = new int[taille];
        while(taille-- > 0)
            tabInverse[taille] = tableau[tableau.length - taille - 1];

        System.out.println("Le tableau inversé est:");
        System.out.print("[");
        while((taille)++ < (tabInverse.length - 1))
            System.out.print(tabInverse[taille] + ((taille == tabInverse.length - 1)?"":","));
        System.out.println("]");
    }

}
