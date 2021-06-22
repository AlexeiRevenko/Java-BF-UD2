import java.util.Scanner;

public class Tableau1 {
    public static void main(String[] args) {
        /*Écrire un algorithme qui saisit 6 entiers et les stocke dans un tableau, puis affiche le contenu
        de ce tableau une fois qu’il est rempli.*/
        int numero = 0;
        int[] tableau = new int[6];
        Scanner recup = new Scanner(System.in);
        while(numero++ != 6 ) {
            System.out.println("Veuillez entrer l'élément "+ numero +" du tableau");
            tableau[numero-1] = recup.nextInt();
        }
        System.out.println("Le tableau que vous avez entré est :");
        System.out.print("[");
        numero = 0;
        while(numero++ < 6)
        {
            //if(numero != 6)
                System.out.print(tableau[numero-1] + ((numero==6)?"":","));
        }
        System.out.println("]");
    }
}
