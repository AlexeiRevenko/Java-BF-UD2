package be.digitalcity.formation.banque;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //creer un nouvel objet, allouer l'espace mémoire nécessaire
        Personne titulaire = new Personne("Ceuleers","Gregory");
        titulaire.setDateNaissance(LocalDate.of(1980,6,26));

        //difference entre une varaible locale et une variable de classe
        //c'est que les variables de classes sont initialisées automatiquement par le systeme
        //par des valeurs par défaut
        //par opposition aux variables locales, qu'il faut initialiser


        Courant courant = new Courant(titulaire, 500);
        courant.setNumero("BE15141215141206");
        /*courant.setTitulaire(titulaire);
        courant.setLigneDeCredit(500);*/


        courant.depot(1000);
        courant.retrait(1200);
        courant.retrait(500); //devrait pas accepter le dernier retrait

        Courant courant1 = new Courant(titulaire,500);
        courant1.setNumero("BE15141565141206");
        courant1.depot(500);
        courant1.retrait(600);

        /*Mise en ratique de la classe banque !*/
        Banque banque1 = new Banque("Banque Ing Belgique");
        banque1.ajouter(courant);
        banque1.ajouter(courant1);

        Courant compteARecherche = banque1.rechercheCompte("BE15141215141206");

        /*
        =================================================

        Mise en pratique de l'exercice avoirDesComptes

        =================================================
        */

        Personne didierLeLimier =new Personne("Lelimier","Didier", LocalDate.of(1900,1,1));
        Banque banqueMonaco = new Banque("Banque Royale de Monaco");
        Courant compteMonaco1 = new Courant("MC58 1122 2000 0101 2345 6789 030",didierLeLimier,5000);

        compteMonaco1.depot(20000);
        compteMonaco1.retrait(182.58);

        Courant compteMonaco2 = new Courant("MC58 3000 4091 7800 0003 2717 157",didierLeLimier, 1000);
        compteMonaco2.depot(15000);
        compteMonaco2.retrait(16000);
        compteMonaco2.depot(513643.25);

        Personne clientBanque2 = new Personne("Navarro", "Dave",LocalDate.of(1967,6,7));
        Courant compteMonaco3 = new Courant("MC58 3000 4091 7000 0103 2483 376", clientBanque2,8000);
        Courant compteMonaco4 = new Courant("MC58 3000 4091 7000 0203 2483 376", clientBanque2,4500);
        compteMonaco3.depot(100000.01);
        compteMonaco3.depot(1234.14);
        compteMonaco3.retrait(3.14);
        compteMonaco3.retrait(1598);

        compteMonaco4.depot(123456789);
        compteMonaco4.retrait(5843486.76);

        banqueMonaco.ajouter(compteMonaco1);
        banqueMonaco.ajouter(compteMonaco2);
        banqueMonaco.ajouter(compteMonaco3);
        banqueMonaco.ajouter(compteMonaco4);

        System.out.println("L'esemble des avoirs de "+didierLeLimier.getNom()+" "+didierLeLimier.getPrenom() +" valent "+banqueMonaco.avoirDesComptes(didierLeLimier)+ " €\n");
        System.out.println("Valeur test " + (compteMonaco1.getSolde()+compteMonaco2.getSolde()));
        System.out.println("L'ensemble des avoirs de "+clientBanque2.getNom()+" "+clientBanque2.getPrenom() +" valent "+banqueMonaco.avoirDesComptes(clientBanque2)+ " €\n");
        System.out.println("Valeur test " + compteMonaco3.getSolde()+ " et "+ compteMonaco4.getSolde());

    }
}
