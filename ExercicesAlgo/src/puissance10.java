import java.util.Scanner;

public class puissance10 {
    public static void main(String[] args) {

        /*À l’aide de la boucle de votre choix, réaliser un algorithme
        calculant le résultat de N^10
        N étant un nombre saisi par l’utilisateur. */

        long base;
        int compteur, entree;
        boolean envie = true;

        Scanner recup = new Scanner(System.in);
        while(envie) {
            compteur = 0;
            System.out.println("Veuillez entrer un entier N");

            entree = recup.nextInt();
            base = 1;
            while (compteur++ != 9) {
                base = base * entree;
                System.out.println("Compteur vaut " + compteur + "et base vaut " + base);
            }
            System.out.println("Le resultat de N à la puissance 10 est : " + base);

            System.out.println("Voullez vous réessayer ? \n - Taper 1 pour OUI \n - Taper 2 pour NON");
            entree = recup.nextInt();

            while(entree != 2 && entree != 1){
                entree = recup.nextInt();
                System.out.println("La valeur que vous avez entrée n'est ni 1, ni 2. \n Veuillez réessayer.");
            }
            if(entree == 2){
                System.out.println("D'accord au revoir !");
                envie = false;
            }
        }
    }
}
