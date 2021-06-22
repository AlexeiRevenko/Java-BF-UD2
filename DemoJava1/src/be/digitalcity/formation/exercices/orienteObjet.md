# Orienté objet

par exemple un pion =+> peut etre considere comme un objet avec des caractéristiques propres
pion ==> taille, couleur, position, se deplacer

l'orienté objet permet de structurer le code en créant des sortes de briques fondamentales, => réutilisables

Modélisation ==> creer des types complexes qui peuvent contenir beaucoup de choses

**va reprenseter les humains que je vais utiliser dans mon programme
//modelisation du type humain ==> qui correspond/sont liéées aux besoins de mon programme
// on pourrait avoir différentes classes d'humains en fonction des besoins requis dans un programme une situation
//créer une classe c'est créer un nouveau TYPE de données personnalisée !
// language fortement typé**

```
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
        *
        *
        * 4 notions pour quasiment tout modéliser : héritage,polymorphisme,abstraction,
        *
        *
        * */
        personne1.afficherNomPrenom();


    }
}
```

**l'affichage des dates se fait selon un format par défaut mais celui ci et perosnnalisable**
on a pas encore vu comment socker une fonction dans une variable

si je met le mot clé *static* dans une méthode d'une classe elle accesible à toutes les instances de l'objet
et pas spécifique/propre à une objet instancié

============================================================

unpackage est un dossier autant physique que logique qui permet de faire des utilisatoins simplifiées

L'import permet de simplifier l'écriture de l'endroit ou se trouve une méthoe un objet, qui ne fait pas partie des 
fonctionnalités minimum 

import java.time.LocalDate;





intérêt d'use des getters et setters sur des variables private
==> les setters sont des méthodes, donc des blocs d'instructions où on peut faire tous les tests que l'on souhaite, !!

```
public void setNom(String value)
{
this.nom = value;
}
```

fait la même chose que
```
Humain personne = new Humain();
personne.prenom = "bob";

```

mais dans mon setNom je peux mettre plein de conditions et de codes supplémentaires

- bloc d'instructions

- on met tout ce que l'on veut

- utile pour les variables de types privates ==> garde fous, et manière d'organiser son code

===================================================================================================
+ plus  jamais de variables de classes en public

+ une variable de classee et un atribut de classe

+ il faut utiliser les getters et les setters

+ une variable de classe de type protected est accessible par les classes enfants

Le prof ne veut.

3 types de polymorphises
====================================================================================================

+ poly. ad hoc
+ poly. param.
+ poly. d'héritage


###polymorphisme d'héritage
un enfant hérite d'un parent, et possede tout ce que possede le parent, mais en plus
l'enfant defini ses propres  propriétés et attribut ==> l'enfant peut etre considéré commme un parent

on peut caster l'enfant en parent dans ce contexte



surcharge d'opérateur est disponible dans C# et C++ mais pas dans Java

https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/operators/operator-overloading


généricité c'est lorsque le type est connu lors de la déclération par lors de la définition
==> coder en générique, c'est code de la manière la plus générale possible ==> contrainte également

Le constructeur
=======================
est une methode 
permet l'instanciation d'un objet classe

public Humain(){
    COUNT++;
}

public Humain(String nom){
    COUNT++;
    this.nom = nom;
}

public Humain(String nom){
    this();  
    this.nom = nom;
}

this(); ==> appelle le constructeur Humain défini plus au sans parametres et donc on a COUNT++ qui est executé sans qu'on l'écrive

public Humain(String nom, String prenom){
    this(nom)
    this.prenom = prenom;
}

**Construction en cascade, mais attention on ne doit pas définir plein de constructeurs différents.
c'est uniquement en fonction de nos besoins ==> le nombre de construteurs différents c'est simplement le nombre manière différentes d'instanciers un objet**





