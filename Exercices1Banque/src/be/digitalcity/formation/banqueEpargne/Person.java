package be.digitalcity.formation.banqueEpargne;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    //classe Person défini un type Person

    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    private Person() {

    }

    public Person(String nom) {
        this.nom = nom;
    }

    public Person(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Person(String nom, String prenom, LocalDate date) {
        this(nom, prenom);
        this.dateNaissance = date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return nom.equals(person.nom) && prenom.equals(person.prenom) && dateNaissance.equals(person.dateNaissance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, dateNaissance);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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




