import java.util.Scanner;

public class RepetitionTiretEspace {
    public static void main(String[] args) {
        /* . Algorithme demandant 3 nombres : nbRep, nbTiret, nbEspace. Ce dernier affiche à l'écran
autant de tiret que la valeur de nbTiret, suivi d'autant d'espace que la valeur de nbEspace. Le
tout autant de fois que la valeur de nbRep.
Exemple : si nbRep = 2, nbTiret = 1 et nbEspace = 3 le résultat est le suivant :
|- - |*/

        //exceptions non traitées

        int compteur;

        int nbRep, nbTiret, nbEspace;
        Scanner entryUser = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de répétitions souhaitées ");
        nbRep = entryUser.nextInt();
        System.out.println("Veuillez entrer le nombre de tirets souhaitées ");
        nbTiret = entryUser.nextInt();
        System.out.println("Veuillez entrer le nombre d'espaces souhaitées ");
        nbEspace = entryUser.nextInt();
        System.out.print("|");
        while(nbRep-- != 0)
        {
            compteur = 0;
            while(compteur++ < nbTiret  )
                System.out.print("-");
            compteur = 0;
            while(compteur++ < nbEspace  )
                System.out.print(" ");
        }
        System.out.print("|");
    }
}
