package be.digitalcity.formation.banqueEpargne;

import java.time.LocalDateTime;
import java.util.Objects;

public class Epargne  extends Compte{

    private LocalDateTime datedernierRetrait;

    public Epargne(String numero, Person titulaire) {
       super(numero, titulaire);
    }

    public LocalDateTime getDateDernierRetrait() {
        return datedernierRetrait;
    }

    public void setDateDernierRetrait(LocalDateTime datedernierRetrait) {
        this.datedernierRetrait = datedernierRetrait;
    }

    protected void retrait(double montant) {
        if (montant < this.solde /*+ this.ligneDeCredit*/) {
            this.solde -= montant;
            this.setDateDernierRetrait(LocalDateTime.now());
            System.out.printf("Retrait de %10.2f EUR sur le compte %s %1 nouveau solde de %12.2f EUR \n", montant,this.getClass().getSimpleName().toUpperCase(),this.numero, this.solde);
            System.out.println(datedernierRetrait);
        } else {
            //le nombre apres le pourcentage va définir un certain
            // et ils vont etre rempli/occupés par les données que
            System.out.printf("Retrait de %10.2f EUR sur le compte courant %1IMPOSSIBLE - SOLDE INSSUFISANT", montant, this.numero, this.solde);
        }
    }

   /* protected void depot(double montant) {
        //on appelle le parent avec super.  et ca nous propose les methodes
        super.depot(montant);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Epargne epargne = (Epargne) o;
        return datedernierRetrait.equals(epargne.datedernierRetrait);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datedernierRetrait);
    }
}
