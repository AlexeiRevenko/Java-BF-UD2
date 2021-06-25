package be.digitalcity.formation.banqueEpargne;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Compte {

    protected String numero;
    protected double solde; //doit
    protected double ligneDeCredit;
    protected LocalDate dateRetrait;
    protected Person titulaire;

    protected void depot(double montant){
        if (montant > 0) {
            this.solde += montant;
            //defini un pattern
            System.out.printf("Dépot de %10.2f EUR sur le compte courant %15s \nnouveau solde de %12.2f EUR\n", montant, this.numero, this.solde);
        }
    }

    protected abstract void retrait(double a);

    protected void setDateRetrait(double retrait) {

    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }



    public Person getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Person titulaire) {
        this.titulaire = titulaire;
    }

    public Compte (){

    }

    public Compte(Person titulaire){
        this.titulaire = titulaire;
    }

    public Compte(String numero , Person titulaire){
        this.numero = numero;
        this.titulaire = titulaire;
    }

    public Compte(Person titulaire, Double ligneDeCredit){
        this.titulaire = titulaire;
        this.ligneDeCredit = ligneDeCredit;
    }

    public Compte(String numero, Person titulaire, Double ligneDeCredit){
        this.numero = numero;
        this.titulaire = titulaire;
        this.ligneDeCredit = ligneDeCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compte compte = (Compte) o;
        return Double.compare(compte.solde, solde) == 0 && Double.compare(compte.ligneDeCredit, ligneDeCredit) == 0 && numero.equals(compte.numero) && dateRetrait.equals(compte.dateRetrait) && titulaire.equals(compte.titulaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, solde, ligneDeCredit, dateRetrait, titulaire);
    }
}
