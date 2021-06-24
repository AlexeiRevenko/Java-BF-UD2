package be.digitalcity.formation.heritage;

public class Enfant extends Parent {

    @Override
    protected  void seDeplacer(){
        System.out.printf("%s se déplace en marchant.", this.nom);
    }

    @Override
    protected void respirer() {
        super.respirer(); // ==> on appelle la super classe, et sa methode
        System.out.println("de l'air et je ne me porte pas plus mal");
    }

    public void actionParEnfant(){
        System.out.println("Bonjour je suis un enfant");
    }
}
