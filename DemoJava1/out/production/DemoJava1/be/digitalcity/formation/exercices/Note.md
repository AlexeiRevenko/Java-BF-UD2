# java syntax

``Arrays.toString(name)``

Links to different coding languages tutorial
``https://www.w3schools.com/java/java_arrays.asp``


**difference entre procedure et fonction**
- procedure ne retourne rien
- fonction retourne qqch

la signature d'une methode/d'une fonction ==> comment elle a été définie

Dans l'ordre
(public/private etc ...)
1)la type de variable retournée/type de retour
2)nom de la méthode
3)parenthèses dans lesquelles on va indiquer tous les paramètres d'entrées

``
void imprimer(int a, int b, int c)
{
System.out.println(a + b + c);
}``

2 étapes ===>
- déclarer la méthode
- l'appeler (le cas échéant, lui passer des paramètres)
  si la méthode ne renvoie rien, je ne dois pas affecter le resultat de la méthode à une variable


exemples
```
public static void M2(int a, int b)
{
	if(a == 0)
		return;  ===> retourne un void et force l'arrêt de la méthode.
	System.out.println("a + b = "+(a+b));

}

```

```
public static double M3(int a)
{
	return a + 5; c'est correct, casting implicite car un INT (ici a + 5) peut etre considéré comme un double !
}
```

```
public static int M3(double a)
{
	return (int)a + 5; casting Explicite est nécessaire car un double ne peut pas etre considéré comme un INT !!!
}
```


## SURCHARGE DE FONCTION
**On peut nommer plusieurs fonctions avec le même nom **
__Les différentes fonctions se différencieront par des paramètres de retours ou/et des paramètres d'entrées différents__
__TOUTEFOIS on ne peut pas avoir les mêmes paramêtres d'entrées et des paramêtres de retour différents__
**Le toutefois est a verifier**
__A nous de savoir quelle méthode on souhaite appeler,surtout si l'IDE ne nous aide pas avec des propositions__



## ... paramètre

exemple 
```
données qui peut etre considérées comme un ensemble de valeurs
public static double moyenne(int... cote)
{
var total = 0;
for(int i = 0 ; i < cote.length ; i++)
total = total + cote[i]; ==> ide propose un for each car on n'altere pas le tableau , on ne fait que parcourir le tableau.
return (double)total/cote.length;
}
```

===>
Puis quand on va appeler cette methode moyenne

```
System.out.println(moyenne(5,6));

System.out.println(moyenne(new int[]{1,2,3})); ==> redondant, mais fonctionne
```

contrainte !!!!


int...  ===> doit tjrs être en dernier parmi les variables d'entrées
...  	===> il ne peut y en avoir qu'un seul parmi les variables d'entrées d'une méthodes




**Surcharge de méthode !!**

##Collections

Autant de crochet que de dimensions
```
int[][] tableau = new int [2][];
tableau[0] = new int[]{1,2,3,4,5};
tableau[1] = new int[]{6,7,8,9,10};

for(int i = 0 ; i <  ; i++)
	for(int j = 0; j < tableau[i].length; j++)
		System.out.println(tableau[i][j]);

OU

for(int[] ints : tableau)
	for(int anInt : ints)
		System.out.println(anInt);
```
Exercices 
==> parcourir un tableau de n dimension, sans savoir à l'avance combien de dimension on aura

Les collections ont ete definies dans des interfaces
interfaces +- contrat de definition, qui donnent le comportement que toute classe/tout objet va venir implémenter
permet de définir les fonctionnalités


*implémenter une interface*
*implémenter un code ==> écrire un code *

1h20

**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~a verifier
classe ; containter directment fonctionnel, 
interface ; on ne peut pas directement instancier, plusieurs classes\implémentations différentes possibles pour une interface
a verifier**



Il y a beaucoup de types de collections différentes ===> voir les différentes collections requises pour la certification


### Interface List<E>
https://docs.oracle.com/javase/8/docs/api/java/util/List.html

Collecions ordonnées

List 
- accepte les doublons
- on accède au éléments de la liste via leur index "la position dans la liste" 



###  ArrayList





```
import java.util.ArrayList;
import java.util.List.

ArrayList<> list = new ArrayList(); ==> type générique ne précise pas de type
ArrayList<Integer> list2 = new ArrayList(Integer); ==> Ineger le type Wraper de int, on ne peut pas indiquer un type primitif dans les types de données

list.add();
list.size();
list.forEach(x -> System.out.println(x))  <== c'est une fonction qui est ecrite de manière synthétisée
list.get(int index)
// !! les indéxeurs ne sont pas implémentés dans les collections comme dans C#, list[i] ==> ne fonctionne pas, incorrect
list.lastIndexOf(int i) ==>  renvoie l'index de la dernière occurence d'un élément
list.set(list.indexOf(5D), 14D);
list.add(list.indexOf(5D), 14D);



list.sort((x,y) -> (int)(x - y));
```

__==> orte de lambda expression__
* ==> il faut écrire un 'comparator' en paramètre, trie de manière croisante 
* tout ce qui est a gauche de la fleche ==> param entree de la fonctions
* a droite de la fleche ==> 




**stocke de maniere ordonnée des données dans un 'container'**
**les tableaux ont par défaut une taille fixe**
**mais les listes vont dynamiquement modifier la taille, on peut ajouter des éléments ou en supprimer
collection dynamique
on peut rajouter à un endroit specifié**

*quand une fonctionnalité return un boolean  on est pas obligé de le recup et de le mettre dans une variable*

==> à check dans les détails aves les autres types





===> il existe Collections ==> qui permet d'avoir toutes une série de fonctionnalités pour les collections
exemple
Collections.max(list);
Collections.reverse(list);



**pour ajouter un element a la liste on va utiliser une FONCTIONNALITÉ**

``list.add(5);``

=====================================a verifier

-type générique

-réfléxivité

=====================================a verifier

Set
- n'autorise pas les doublons ==> peut etre utile pour les data bases

**Les modifications dynamiques sont fondamentales notamment lorsqu'on intéragit et gère des bases de données**


### List
==> si j'ai bien compris, interface , nous demane de redefinir l'implementation, et toutes les methodes qui vont avec, 
à la différence de ArrayList classe implémentée de l'interface List

### class HashSet de l'interface Set
```
HashSet<Integer> set = nw HashSet<>();
set.add(5); retourne vrai
set.add(15); retourne vrai
set.add(5); retourne faux car n'a pas pu ajouter le doublons

Ne peut pas contenir des doublons, mais l'intérêt c'est d'eviter les doublons
set.forEach (x -> sout(x))
set.size();
pas d'accès aux indexeurs
// set[0] = 5 ==> erreur

LinkdHashSet<Integer> linkedSet = new LinkedHashSet<>();
linkedSet.add(5);
 ```

 ### HashMap
 
``` 
HashMap<Integer, String> map = new HashMap<>();
map.put(Integer key, String value)
map.put(1, "Bonjour");
map.put(18, "Je suis");
map.get(Object key); ==> il faut indiquer la key de l'élément recherché
map.getOrDefault(Object key, String defaultValue);


*Si on veut parcourir ce type de tableau*

for (Map.Entry<Integer, String> entry : map.entrySet()) 
{
    System.out.println(entry.getKey() + " -> " +entry.getValue());
}
for(Integer key : map.keySet())
    System.out.println(key);   
for(String value : map.values())
    System.out.println(value);  
```
==>entrySet() va renvoyer un objet sur lequel on pourra boucler

Exercice
==>voir, exercice divers 1

écrire un tableau associatif
bulletin d'une classe
clé associative ==> nom et prénom

```
HashMap <String[], int> bulletin = new HashMap();
bulletin.put(new String[]{"Didier","Caillou"}, 18);
```


==================================================================

Java: Generating a random char (a-z)
A random character between 'a' and 'z':
```
Random rnd = new Random();
char c = (char) ('a' + rnd.nextInt(26));
A random character from a string of characters:

String chars = "abcxyz";
Random rnd = new Random();
char c = chars.charAt(rnd.nextInt(chars.length()));
```






