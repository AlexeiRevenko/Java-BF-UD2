import java.util.Scanner;

public class PlusPetitEntier {
    public static void main(String[] args) {


        /*8. Ecrire un algorithme qui demande à l’utilisateur de taper 10 entiers et qui affiche le plus petit
        de ces entiers.*/

        System.out.println("Veuillez entrer 10 nombres entiers et on vous renvera le plus petit d'entre eux");
        int compteur = 0, minimum = 0, entree = 0;
        Scanner recup = new Scanner(System.in);
        while(compteur++ < 10){
            System.out.println("Veuillez entrer votre nombre numéro " + compteur);
            entree = recup.nextInt();
            if(entree < minimum)
                minimum = entree;
        }
        System.out.println("Le plus petit entier que vous avez entré est \n ==> "+ minimum);
    }
}
