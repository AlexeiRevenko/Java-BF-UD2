package be.digitalcity.formation.banque;

import java.time.LocalDate;

public class Personne {
    //classe personne défini un type personne

    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    private Personne(){

    }
    public Personne(String nom){
        this.nom = nom;
    }
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne(String nom, String prenom, LocalDate date){
        this(nom,prenom);
        this.dateNaissance = date;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) { this.prenom = prenom;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public String getNom() {
        return nom;
    }
}
