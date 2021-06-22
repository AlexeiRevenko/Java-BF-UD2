package be.digitalcity.formation;

import java.time.LocalDate;

public class Humain {
    //public défini le niveau d'accessibilité
    // important de définir une variable par ligne
    public String nom;
    public String prenom;

   //LocalDate objet de type date
   public LocalDate anniversaire;

   //pour compter le nombre d'instanciation
   public static int COUNT;

    /**
     * Constructeur
     */
    public Humain()
    {
        COUNT++;
    }

    /**
     * Getters & setters
     *
     *
     * getter; accessibiite + type de retour + nom du getteur
     */

    public String getNom()
    {
        return this.nom;
    }

    // setter
    public void setNom(String value)
    {
        this.nom = value;
    }





    //le mot clé this, va pointer l'objet courant
    //attention dans un contexte static de classe , pas d'instance, donc on ne peut/doit pas utiliser le mot clé this

    //variable membres de la classe/variables globales ==>  on voit qu'elles ne sont pas initialisées
    //le système va par défaut mettre les valeurs par défaut dans ces variables de classes
    //automatiquement initialisée : int => 0, char => caractere null, String => chaine vide
   public void afficher(){
       System.out.println(nom+" "+prenom + " "+ anniversaire);
   }

}
