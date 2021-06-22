package be.digitalcity.formation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Bienvenue dan Java SE11");

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        System.out.println("message");

        byte octet = 127;
        short deuxOctets = 32767;
        short deuxOctet  = -32768;
        long lo = 10000000000L; //dès qu'on a véritablement une valeur
        float f = 1.5F;
        double d = 1.5;


        int i = Integer.parseInt("1234");
        System.out.println(i);

        int incr = 5;
        //break n'est pas obligatoire dans le switch mais si il n'est pas mis, les cases et les instructions vont s'enchainer en cascade
        switch(incr){
            case 4:
            case 5:
            case 6:
                System.out.println("coucou");
            case 7:
                System.out.println("encore moi");
                break;
            default:
                System.err.println("pas normal"); // formatage d'affichage des erreurs
                break;
        }



        //boucle for each
        // sur la collection definie je vais parcourir la collection/le tableau, et a chaque variable/donnée que je rencontre
        //je vais la stocker/copier dans une variable temporaire créer dans la boucle for each

        for(int item : new int[]{1,2,3,4}){

            /*!!! pas de gestions des indexs, c'est une boucle pour parcourir une collection, l'utiliser mais on ne peut pas
            * modifier/ altérer le contenu de la collection */

            //Si je veux modifier le tableau/la collection je devrais utiliser une boucle for classique par exemple
        }
        int [] tab = new int[]{1,2,3,4};
        for (int item: tab) {

        }

        /** il est possible de passer certains répétitions avec le mot clé continue, on ne sort pas de la boucle
         * on passe juste à l'itération suivante sans exécuté le instructions après le continue
         *
         *
         * le mot clé, break
         * va arrêter et sortir de la boucle
         * **/



    }
}
