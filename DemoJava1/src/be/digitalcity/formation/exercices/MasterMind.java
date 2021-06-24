package be.digitalcity.formation.exercices;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class MasterMind {

    public static final String RESET = "\033[0m";  // Text Reset

    // Background
    public static final String BLACK_BACKGROUND = "\033[0;100m";  // BLACK
    public static final String RED_BACKGROUND = "\033[0;101m";    // RED
    public static final String GREEN_BACKGROUND = "\033[0;102m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[0;103m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[0;104m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[0;106m";   // CYAN
    public static final String GREY_BACKGROUND = "\033[47m";  // WHITE

    public static void main(String[] args) {




        int step            = 0;
        int [] playerTab    = new int[5];
        int [] genTab       = generating(5);
        Scanner sc          = new Scanner(System.in);
        HashMap <Integer, int[]> listeCombinaisons = new HashMap<>();
        String answer = null;
        String[] colors     = new String[]{"Noir","Rouge","Vert","Jaune","Bleu","Violet","Turquoise","Gris"};

        System.out.println("Vous avez droit à 12 chances pour deviner la bonne combinaison");
        boolean ok = true;

        do {
            System.out.println("Veuillez entrer une combinaison de 5 chiffres (allant de 1 à 8), sans espaces \nexemples : 12345\nSachant que :");
            for (int i = 0; i < 8; i++)
                System.out.println((i + 1) + " - " + colors[i]);
            for (int f : genTab)
                System.out.printf(""+(f+1));
            System.out.println("");
            while (ok){
                answer = sc.nextLine();
                if (answer.length() != 5 || !parseInt(answer))
                    System.out.println("Vous n'avez pas entré une bonne combinaison");
                else
                    ok = false;
            }
                for (int j = 0; j < 5; j++)
                    playerTab[j] = answer.charAt(j) - 48;

            listeCombinaisons.put(step,playerTab);


            compareMasterTabs(playerTab, genTab);

        }while(ok);
    }

    private static void compareMasterTabs(int[] player, int[] gen) {
        int colorAndPosition = 0;
        int color = 0;
        boolean already = true;
        for(int a = 0 ; a < player.length ; a++)
        {
            already = (player[a] != gen[a]);
            colorAndPosition = (player[a] == gen[a] ? colorAndPosition + 1 : colorAndPosition );

            for(int b = a ; b < player.length ; b++ )
                color = (player[a] == gen[b] && already)? color + 1 : color ;
        }
        System.out.println("Couleur et position\t\t" +"Vos combinaisons\t\t" +"Uniquement position");

        //placement et affichage du nombre de correspondances couleurs-positions
        while(colorAndPosition-- > -1)
            System.out.printf("X");
        System.out.printf("\t\t\t\t\t\t");

        //affichage des couleurs entrées par l'utilisateur
        for (int k : player) {
            switch (k) {
                case 1 -> System.out.print(BLACK_BACKGROUND + "\t" + RESET);
                case 2 -> System.out.printf(RED_BACKGROUND + "\t" + RESET);
                case 3 -> System.out.printf(GREEN_BACKGROUND + "\t" + RESET);
                case 4 -> System.out.printf(YELLOW_BACKGROUND + "\t" + RESET);
                case 5 -> System.out.printf(BLUE_BACKGROUND + "\t" + RESET);
                case 6 -> System.out.printf(PURPLE_BACKGROUND + "\t" + RESET);
                case 7 -> System.out.printf(CYAN_BACKGROUND + "\t" + RESET);
                case 8 -> System.out.printf(GREY_BACKGROUND + "\t" + RESET);
            }
        }

        //placement et affichage du nombre de correspondances juste position
        while(color-- > -1)
            System.out.println("\tX");
    }

    private static boolean parseInt (String java)
    {
        try{
            Integer.parseInt(java);
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    private static int[] generating(int taille)
    {
        int[] tableau = new int[taille];
        Random rdn = new Random();
        while (taille-- > 0)
            tableau[tableau.length - taille - 1] = rdn.nextInt(8);
        System.out.println("Le tableau MasterMind secret a été généré !\n");
        return tableau;
    }

}
