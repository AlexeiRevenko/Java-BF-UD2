
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tableau5 {
    public static void main(String[] args) {

        System.out.println("Quelle taille de tableau souhaitez vous avoir ?");
        Scanner recup = new Scanner(System.in);
        int taille = recup.nextInt();
        int []tabAOrdonner = generate(taille);

        System.out.println("Le tableau ordonné est:");
        afficherTableau(ordonner(tabAOrdonner));
    }

    private static int[] generate(int taille)
    {
        int [] tableau = new int[taille];
        while(taille-- > 0)
            tableau[tableau.length - taille - 1] = ThreadLocalRandom.current().nextInt(-10,10);
        System.out.println("Le tableau généré est:");
        afficherTableau(tableau);
        return tableau;
    }

    private static int[] ordonner(int []tableau)
    {
        int n;
        int etape = 0;
        int swapValue = 0;
        int indice = 0;
        while(tableau.length > etape++){
            System.out.println("etape "+ etape);
            n = -1 + (etape - 1) ;
            swapValue = tableau[etape - 1];
            System.out.println(" swapvalue " + swapValue + " de l'étape "+ etape + " \n");
            while(++n < tableau.length){
                if (tableau[n] < swapValue) {
                    swapValue = tableau[n];
                    indice = n;
                }
                System.out.println("n vaut " +n + " swapValue vaut " + swapValue);
            }
            System.out.println(" swapvalue " + swapValue + " de l'étape "+ etape + " indice vaut "+ indice+ " \n" +
                    "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            tableau[indice] = (tableau[etape - 1] != swapValue)?tableau[etape - 1]:tableau[indice];
            tableau[etape - 1] = swapValue;
            System.out.println("Le tableau a l'etape " + etape+ " vaut ");
            afficherTableau(tableau);
        }
        return tableau;
    }

    private static void afficherTableau(int []tab){
        int i = -1;
        System.out.print("[");
        while(++i < tab.length)
            System.out.print(tab[i] + ( ( ( i == (tab.length - 1))?"":",")));
        System.out.println("]");
    }
}

