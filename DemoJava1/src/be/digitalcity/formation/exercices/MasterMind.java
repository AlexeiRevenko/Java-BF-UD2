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
    public static final String GREY_BACKGROUND = "\033[0;107m";  // WHITE

    public static void main(String[] args) {

        int step = 0;
        int[] playerTab = new int[5];
        int[] genTab = generating(5);
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, int[]> listeCombinaisons = new HashMap<>();
        String answer = null;
        String[] colors = new String[]{"Noir", "Rouge", "Vert", "Jaune", "Bleu", "Violet", "Turquoise", "Gris"};

        System.out.println("Vous avez droit à 12 chances pour deviner la bonne combinaison");
        boolean ok = true;

        do {
            System.out.println("Veuillez entrer une combinaison de 5 chiffres (allant de 1 à 8), sans espaces \nexemples : 12345\nSachant que :");

            for (int i = 0; i < 8; i++)
                System.out.println((i + 1) + " - " + colors[i]);
            for (int f : genTab)
                System.out.print("" + f);
            System.out.println("");

            while (ok) {
                answer = sc.nextLine();
                if (answer.length() != 5 || !parseInt(answer))
                    System.out.println("Vous n'avez pas entré une bonne combinaison");
                else
                    ok = false;
            }

            for (int j = 0; j < 5; j++)
                playerTab[j] = answer.charAt(j) - 48;
            listeCombinaisons.put(step, playerTab);
            compareMasterTabs(playerTab, genTab);


            boolean internalCheck = true;
            while(internalCheck) {
                System.out.println("\n\nVoulez vous réessayer ? O/N");
                answer = sc.nextLine();
                if (answer.equals("No") || answer.equals("n") || answer.equals("N") || answer.equals("no") || answer.equals("NON") || answer.equals("non")) {
                    ok = false;
                    internalCheck = false;
                }
                else if (answer.equals("Oui") || answer.equals("O") || answer.equals("o") || answer.equals("yes") || answer.equals("YES") || answer.equals("oui")) {
                    ok = true;
                    internalCheck = false;
                }
                else
                    System.out.println("Vous n'avez pas entré une réponse valable ! ");
            }

        } while (ok);
    }

    private static void compareMasterTabs(int[] player, int[] gen) {
        int colorAndPosition = 0;
        int color = 0;
        boolean already = true;


        for (int parc = 0; parc < player.length; parc++)
            if (player[parc] == gen[parc]) {
                colorAndPosition++;
                gen[parc] = 0;
            }

        for (int j : player) {
            for (int b = 0; b < player.length; b++) {
                if (j == gen[b]) {
                    gen[b] = 0;
                    color++;
                }
            }
        }

        System.out.println("Couleur et position\t\t" + "Vos combinaisons\t\t" + "Uniquement couleur");

        //placement et affichage du nombre de correspondances couleurs-positions
        while (colorAndPosition-- > 0)
            System.out.print("X");
        System.out.print("\t\t\t\t\t\t");

        //affichage des couleurs entrées par l'utilisateur
        for (int k : player) {
            switch (k) {
                case 1 -> System.out.print(BLACK_BACKGROUND + "\t" + RESET);
                case 2 -> System.out.print(RED_BACKGROUND + "\t" + RESET);
                case 3 -> System.out.print(GREEN_BACKGROUND + "\t" + RESET);
                case 4 -> System.out.print(YELLOW_BACKGROUND + "\t" + RESET);
                case 5 -> System.out.print(BLUE_BACKGROUND + "\t" + RESET);
                case 6 -> System.out.print(PURPLE_BACKGROUND + "\t" + RESET);
                case 7 -> System.out.print(CYAN_BACKGROUND + "\t" + RESET);
                case 8 -> System.out.print(GREY_BACKGROUND + "\t" + RESET);
            }
        }
        //placement et affichage du nombre de correspondances juste position
        System.out.print("\t");
        while (color-- > 0)
            System.out.print("X");
    }

    private static boolean parseInt(String java) {
        try {
            Integer.parseInt(java);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static int[] generating(int taille) {
        int[] tableau = new int[taille];
        Random rdn = new Random();
        while (taille-- > 0)
            tableau[tableau.length - taille - 1] = rdn.nextInt(8) + 1;
        System.out.println("Le tableau MasterMind secret a été généré !\n");
        return tableau;
    }

}
