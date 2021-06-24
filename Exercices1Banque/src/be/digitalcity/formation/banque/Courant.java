package be.digitalcity.formation.banque;

import java.time.LocalDate;

public class Courant {
    // class courant défini un nouvau type de donnée
    // tant qu'il n'y a pas d'ambiguité entre les varuables de classes et celles des mthodes, on place le mot this, mais ce n'est pas obligatoire
    private String numero;
    private double solde; //doit être en lecture seule, uniquement un getter
    private double ligneDeCredit;
    private Personne titulaire;
    private LocalDate dateDernierRetrait;


    //on rend innacessible les constructeurs sans parametres en dehors des classes
    private Courant(){

    }

    public Courant(Personne titulaire){
        this.titulaire = titulaire;
    }

    public Courant(Personne titulaire, double ligneDeCredit){
        this.titulaire = titulaire;
        this.ligneDeCredit = ligneDeCredit;
    }

    public Courant(String numero, Personne titulaire, double ligneDeCredit){
        this.numero = numero;
        this.titulaire = titulaire;
        this.ligneDeCredit = ligneDeCredit;
    }

    public void depot(double montant)
    {
        //faire un depot de 0, ou négatif n'est pas très logique,ces operaions sont enregistrées et n'apportent rien
        if(montant > 0){
            this.solde += montant;
            //defini un pattern
            System.out.printf("Dépot de %10.2f EUR sur le compte courant %15s \nnouveau solde de %12.2f EUR\n", montant, this.numero, this.solde);

        }
    }

    public void retrait(double montant) {
        if(montant < this.solde + this.ligneDeCredit){
            this.solde -= montant;
            System.out.printf("Retrait de %10.2f EUR sur le compte courant %15s \n" +
                "nouveau solde de %12.2f EUR\n", montant, this.numero, this.solde);
        }
        else{
            //le nombre apres le pourcentage va définir un certains espaces, un nombre de carctere ==> ici 10
            // et ils vont etre rempli/occupés par les données que l'on va transmettre, sil'on met uniquement %f ça devrait fonctionner
            System.out.printf("Retrait de %10.2f EUR sur le compte courant %15s \n" +
                    "IMPOSSIBLE - SOLDE INSSUFISANT\n", montant, this.numero, this.solde);
        }
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
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

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {
        this.ligneDeCredit = Math.abs(ligneDeCredit);
    }
}
