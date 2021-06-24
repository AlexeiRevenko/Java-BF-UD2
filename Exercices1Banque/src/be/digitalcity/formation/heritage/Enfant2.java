package be.digitalcity.formation.heritage;

public class Enfant2 extends Parent{

    @Override
    protected void seDeplacer() {
        System.out.printf("%s se déplacer en nageant.",this.nom);
    }
}
