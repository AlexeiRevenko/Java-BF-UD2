package be.digitalcity.formation;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //C'est comme ça qu'on doit instanciéer un nouvel objet
        //instanciation avec tout ce que l'objet contient !
        //instanciation via une petite fonction specifique ==> un constructeur
        //constructeur va créer le moule de l'objet
        //un moule général par défaut instancié à partir du modèle décrit dans la classe
        Humain personne1 = new Humain();
        /*
        - cette variable de type complexe
        - via l'opérateur d'accessiblité, qui est le point .  <==
        - la classe au sommet de toutes les autres classes est la classe Objet, tout au sommet de l'arborescence
        - la classe Objet defini un minimum qu'absolument tous les objets/tout types possèdes une série de méthodes et de fonctionnlités
          définies dans la classe object
        - on peut voir ces différentes fonctionnalités/méthodes minimum en faisant  personne1.(...)
        */

        //normallement vient recuperer la valeur prenom de l'objet personne1 qui à été instancié
        //personne1.prenom
        //On peut dirrectement affecter une valeur prenom à notre objet
        personne1.prenom = "James";
        personne1.nom    = "Rocket";

        //une date est ausi un type complexe de données
        // je ne peux pas utiliser le mot clé new LocalDate car elle est private
        personne1.anniversaire = LocalDate.of(1980,6,26);
        /*le mot clé static pour une classe fait qu'une classe ne peut pas être instanciée
        * le système va créer lui même une instance une objet
        * que l'utilisateur pourra appeler
        * Idée c'est quand  on a pas besoin d'utiliser plusieurs instances d'un objet
        *
        *
        *
        *
        * exemple d'un objet "dé" dans un jeu de plateau  ==> le dé à toujours les mêmes pp et on le réutilise tout le temps*/

        /*le mot clé private permet de masquer la donnée/la fonctionnalité en dehors du conteneur dans lequel l'élément est situé
        *
        * */
        personne1.afficher();

        Humain personne2 = new Humain();
        personne2.prenom    = "Caro";
        personne2.nom       = "Herssens";
        personne2.anniversaire = LocalDate.of(1983,9,26);


        System.out.println(Humain.COUNT);

    }
}
