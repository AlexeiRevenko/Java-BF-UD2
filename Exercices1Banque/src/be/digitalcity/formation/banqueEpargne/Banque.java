package be.digitalcity.formation.banqueEpargne;

import be.digitalcity.formation.banque.Personne;

import java.util.HashMap;
import java.util.Map;

public class Banque {
    //on peut faire une collection des comptes courants
    //avec un hashmap on pourrait faire une clé qui correspond au numero de compte et la données serait
    //le compte courant associé avec toutes les données qui vont avec

    //la logique c'est d'abord créer une banque, puis ensuite on va ajouter des comptes

    private String nomDeBanque;
    private final HashMap<String, Compte> listeDesComptes = new HashMap<>();


    public Banque(String nom){
        this.nomDeBanque = nom;
    }

    public String getNom() {
        return nomDeBanque;
    }

    public void setNom(String nom) {
        this.nomDeBanque = nom;
    }

    public void ajouter(Compte compte){
        //quand on fait des opérations avec des variables, attention à verifier le cas où l'objet et null
        if(compte != null){
            System.out.println("Le compte "+ compte.getClass().getName()+" : "+compte.getNumero() + " a été ajouté à la banque "+this.nomDeBanque);
            System.out.println("Le titulaire de ce compte est \n- nom : "+ compte.getTitulaire().getPrenom() +"\n- prénom : "+compte.getTitulaire().getNom()+
                    "\n- date de naissance : "+compte.getTitulaire().getDateNaissance()+"\n");
            this.listeDesComptes.put(compte.getNumero(), compte);
        }else
            System.out.println("Impossible d'ajouter le compte");

    }

    public void supprimer(String numero){
        if(this.listeDesComptes.remove(numero) != null)
            System.out.println("Le compte : "+numero + " a été supprimé de la banque "+this.nomDeBanque + " \n");
        else
            System.err.println("Le compte "+numero+" n'a pas été trouvé");
        // .err est un flux de sortie différent de .out !!!
        // .err est le fl
    }

    public Compte rechercheCompte(String numero){
        if(numero != null)
            if(this.listeDesComptes.containsKey(numero))
                return this.listeDesComptes.get(numero);
            else
                System.err.printf("Le compte [%15s] n'a pas été trouvé", numero);
        else
            System.err.println("Le numero de compte n'est pas valide !");
        return null;
    }

    //foreach de l'HASHMAP a revoir
    //on me dit qu'il faut utiliser
    // nameOfString1.equals(nameOfString2) ==> returns true or false
    // pourquoi ? ==> A CHECK
    // difference entre type reference, type objet,type complexe ==> notions similaires et différentes
    public double avoirDesComptes(Personne titulaire){
        double total = 0;
        //quand on vera les exceptions ==> on pourra
        if(titulaire != null)
            for(Map.Entry<String, Compte> entry : listeDesComptes.entrySet())
                if(titulaire.getPrenom().equals(entry.getValue().getTitulaire().getPrenom()) && titulaire.getNom().equals(entry.getValue().getTitulaire().getNom())&& entry.getValue().getSolde() >= 0)
                    total = total + entry.getValue().getSolde();
        return total;
    }
    //quand le double est trop  grand ==> l'affichage va nous montrer une ecriture scientifique
    //mais perte de précision ==> truc pour gérer ça, ==> on travaille avec des types "long"
    // ==> et on divise avec l'affichage on règle l'emplacement de la virgule ou on divise par 100.


    /*
    public double CorrectionAvoirDesComptes(Personne titulaire){
        byte compteur = 0;
        if(titulaire != null){
            double totalAvoir = 0;
            for(Compte compte : this.listeDesComptes.values())
                if(compte.getTitulaire().equals(titulaire))
                    if(compte.getSolde() > 0)
                        totalAvoir += compte.getSolde();
                        compteur++;
        //on pourrait deja créer au prealable une fonctionnalite
        //qui utilise le nom et le prenom et renvoie une chaine de caractere deja construite !
            if(compteur > 0)
                System.out.printf("Total des avoirs de %25s : %.2f EUR\n", titulaire.getPrenom(),titulaire.getNom(),totalAvoir );
            else
                System.out.printf("Total des avoirs de %25s n'a pas d'avoir dans notre banque", titulaire.getPrenom() + " "+ titulaire.getNom());
        return totalAvoir;
        }else
            System.err.printf("Total des avoirs de %25s n'a pas été trouvé !", titulaire.getPrenom() + " "+ titulaire.getNom());
        return 0;
    }*/
}