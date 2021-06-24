package be.digitalcity.formation.heritage;

public abstract class Parent {

    //des qu'une classe contient une fonctionnalité abstraite
    //ma classe doit obligatoirement devenir abstraite ==> classe abstraite ne peut pas être instanciée
    //methode abstraite ==> oblgigation des enfants de redefinit la methode

    protected String nom;
    protected abstract void seDeplacer();

    public/*protected*/ String getNom(){
        return this.nom;
    }

    protected void respirer(){
        System.out.printf("%s repire", this.nom);
    }

    public/*protected*/ void setNom(String nom) {
        this.nom = nom;
    }
    // getter et setter vaut mieux toujours les mettres en publics ==> sinon ils ne sont plus accessibles
    // avec les getters et les setters en dehors du package


    public final void nonRedefinissableParEnfant(){

    }

}
