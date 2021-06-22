import java.util.Random;
import java.util.Scanner;

public class PlusOuMoins {
    public static void main(String[] args) {

        /*7. Réalisez le jeu du Plus ou Moins.
                L'ordinateur choisi un nombre aléatoirement entre 1 et 100. L'utilisateur est invité à entrer un
        nombre et l'algorithme nous répond "C'est plus" ou "C'est moins". Lorsqu'on a trouvé le bon
        nombre, l'algorithme affiche le nombre de tentatives effectuées pour trouver le résultat*/


        Random randomNumber = new Random();
        byte upperLimit = 100;
        int proposition = -1;
        int essais = 0;
        int aleatoire = 1 + randomNumber.nextInt(upperLimit);
        Scanner recup = new Scanner(System.in);

        System.out.println("Veuillez entrer votre proposition. (entier entre 1 et 100)");
        while(proposition != aleatoire) {
            proposition = recup.nextByte();
            essais++;
            if(proposition > aleatoire)
                System.out.println("C'est moins !");
            else if(proposition < aleatoire)
                System.out.println("C'est plus !");
        }
        System.out.println("Bravo vous avez trouvé !" + " \n En " + essais + "essais");
    }
}
