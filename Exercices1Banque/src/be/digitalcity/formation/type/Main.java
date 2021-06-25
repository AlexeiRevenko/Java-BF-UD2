package be.digitalcity.formation.type;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    int a = 5; //type primitif ne contient qu'une valeur, pas de fonctionnalites que l'on peut aller chercher avec a.
        //les types primitifs ne sont pas considérés comme des classes

        /*sur les types primitifs la comparaison se fait avec ==
        *
        * mais les comparaisons avec les strings et les objets se fait par la méthode equals()
        *
        * la classe Object définit toString, equals, hashCode,
        *
        * que l'on peut rédéfinir pour adapter ces methodes à nos objets
        *
        * EQUALS ET HASHCODE DOIVENT TOUJOURS  ETRE REDEFINIES DANS UN NOUVEL OBJET
        *
        *
        *
        * ALT + INSERT ==> pour equals and hashCode ==> regarder le structure du code
        * définir partout Equals and hashCode pour pouvoir tout le temps comparer des objets
        *
        *
        * different mode d'affichage pour les toString
        *
        *
        * StringBuilder object qui permet de construire des strings avec différentes méthodes associées
        * à la classe
        *
        * sb.append("nom .").append("sfdsg").append('\') ===> si on veut chainer des fonctionnalités dans un objet
        *
        * ===> return this; ====> très utilisé
        *
        * */

        //Boxing totalement implicite
        //Conversion implicite
        int i = 6; //type primitif
        Integer j = i; // transformer ==> mettre un type primitif dans un type référence
        //evidemment en ayant le bon type d'objet !



        //Unboxing
        // converison implicite également
        Integer k = 15;
        int l = k;

        //depuis java 5,le copilateur gère pour nous la conversions d'un type primitif vers son type wrapper
        // ==> sinon avant java 5 c'était une conversion explicite ==> donc par un CASTING
        //un type primitif ne peut pas naturellement être utilisée par les types génériques
        //obligés de passer par un type wrapper
        // ==> pas possible de mettre int il faut mettre integer !
        // ArrayList<int> entiers  = new ArrayList<int>();
        // ArrayList<Integer> entiers  = new ArrayList<int>();
    }
}
