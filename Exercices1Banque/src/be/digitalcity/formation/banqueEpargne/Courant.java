package be.digitalcity.formation.banqueEpargne;

import java.time.LocalDateTime;
import java.util.Objects;

public class Courant extends Compte{

    private double ligneDeCredit;

     private Courant(){
     }

    public Courant(Person titulaire, Double ligneDeCredit) {
        super(titulaire, ligneDeCredit);
    }

    public Courant(String numero, Person titulaire, Double ligneDeCredit) {
        super(numero, titulaire, ligneDeCredit);
    }

     /* protected void depot(double montant) {
        //on appelle le parent avec super.  et ca nous propose les methodes
        super.depot(montant);
    }*/

    protected void retrait(double montant) {
        if (montant < this.solde /*+ this.ligneDeCredit*/) {
            this.solde -= montant;
            System.out.printf("Retrait de %10.2f EUR sur le compte %s %1 nouveau solde de %12.2f EUR \n", montant,this.getClass().getSimpleName().toUpperCase(),this.numero, this.solde);
        } else {
            //le nombre apres le pourcentage va définir un certain
            // et ils vont etre rempli/occupés par les données que
            System.out.printf("Retrait de %10.2f EUR sur le compte courant %1IMPOSSIBLE - SOLDE INSSUFISANT", montant, this.numero, this.solde);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Courant courant = (Courant) o;
        return Double.compare(courant.ligneDeCredit, ligneDeCredit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ligneDeCredit);
    }
}
