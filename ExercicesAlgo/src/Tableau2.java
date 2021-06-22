import java.util.Scanner;

public class Tableau2 {
    public static void main(String[] args) {
        /*
        2. BONUS : initialiser un tableau de 10 entiers avec les valeurs 2, 4, 8, 16, 32, 64, 128, 256, 512,
1024 à l’aide d’une boucle. Ensuite, à l’aide d’une boucle afficher la valeur de chaque cellule
du tableau avec l’opération Ecrire().

         */
        int numero = 0, base = 1;
        int[] tableau = new int[10];

        while(numero++ != 10 ) {
            base = base * 2;
            tableau[numero-1] = base;
        }
        System.out.println("Le tableau est :");
        System.out.print("[");
        numero = 0;
        while(numero++ < 10)
            System.out.print(tableau[numero-1] + ((numero==10)?"":","));
        System.out.println("]");
    }
}
