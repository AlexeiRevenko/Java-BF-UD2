package be.digitalcity.formation.heritage;

public class Main {
    public static void main(String[] args) {
        Enfant humain1 = new Enfant();
        //humain1.nom = "Paul"; propriete nom est accessible car on est dans le m[eme package !
        humain1.setNom("Alfred");
        humain1.seDeplacer();
        humain1.respirer();

        Parent humain3 = new Enfant();
        //humain3. ==> ne peut pas appeler la methode définie dans la classe enfant
        humain3.respirer();


        /*
        *
        *  public void actionParEnfant(){
                System.out.println("Bonjour je suis un enfant");
            }
        *
        *
        * */
    }
}
