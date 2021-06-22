package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class Tableau7 {

    private static int position = 0;
    private static int i = 0,j = 0;

    public static void main(String[] args) {

        boolean typeTableau = true;
        System.out.println("Vous souhaitez un tableau à 1 dimension ou à 2 dimension ?\n" +
                "Tapez 1 pour 1 dimension ou 2 pour 2 dimension");
        Scanner recup = new Scanner(System.in);
        byte dj = recup.nextByte();
        while (typeTableau) {
            if (dj == 1 || dj == 2)
                typeTableau = false;
            else {
                System.out.println("Le nombre que vous avez entré n'est ni 1, ni 2. Veuillez réessayer !");
                dj = recup.nextByte();
            }
        }

        if (dj == 1) {
            int[] tableau1D;
            tableau1D = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            System.out.println("Un tableau de 10 cases avec un pion dans la première case à été généré, le voici !");
            afficherTableau(tableau1D);
            char choix;
            boolean envy = true, entry;

            do{
                entry = true;
                do {
                    System.out.println("Si vous souhaitez :\n- Aller à gauche ==> tapez 'g'\n-Aller à droite ==> tapez 'd'\nQuitter le jeu ==> tapez 'q'");
                    choix = recup.next().charAt(0);
                    if(choix == 'q' || choix == 'Q' || choix == 'g' || choix != 'G' || choix != 'd' || choix == 'D')
                        entry = false;
                    else
                        System.out.println("Veuillez rentrer l'un des choix propositionés, (en minuscule ou en majuscule)");
                }while(entry);

                if((choix == 'g' && tableau1D[0]!= 1)||(choix == 'd' && tableau1D[9]!= 1))
                    tableau1D = move1D(choix, tableau1D);
                else if(choix == 'q')
                    envy = false;
                else if (tableau1D[0] == 1)
                    System.out.println("Vous ne pouvez pas aller à gauche !");
                else
                    System.out.println("Vous ne pouvez pas aller à droite !");
            }while(envy);

            System.out.println("Merci d'avoir joué");
        }
        else {
            int[][] tableau2D = new int[10][10];
            tableau2D = fill2Dtable(tableau2D);
            afficherTableau2D(tableau2D,(byte)10,(byte)10);
            char choix;
            boolean envy = true, entry;
            do{
                entry = true;
                do {
                    System.out.println("Si vous souhaitez :\n-Aller à gauche ==> tapez 'g'\n-Aller à droite ==> tapez 'd'\n" +
                            "-Aller vers le haut ==> tapez 'h'\n-Aller le bas ==> tapez 'b'\n Quitter le jeu ==> tapez 'q'");
                    choix = recup.next().charAt(0);
                    if(choix == 'q' || choix == 'Q' || choix == 'g' || choix != 'G' || choix != 'd' || choix == 'D' || choix == 'h' || choix == 'H' || choix == 'b' || choix != 'B')
                        entry = false;
                    else
                        System.out.println("Veuillez rentrer l'un des choix propositionés, (en minuscule ou en majuscule)");
                }while(entry);

                if(((choix == 'g' || choix == 'G') && j != 0) ||((choix == 'd' || choix == 'D') && j != 9) ||((choix == 'b' || choix == 'B') && i != 9) ||((choix == 'h' || choix == 'H') && i != 0))
                    tableau2D = move2D(choix, tableau2D);
                else if(choix == 'q')
                    envy = false;
                else if (choix == 'g' || choix == 'G')
                    System.out.println("Vous ne pouvez pas aller à gauche !");
                else if (choix == 'd' || choix == 'D')
                    System.out.println("Vous ne pouvez pas aller à droite !");
                else if (choix == 'h' || choix == 'H')
                    System.out.println("Vous ne pouvez pas aller vers le haut !");
                else
                    System.out.println("Vous ne pouvez pas aller vers le bas !");
            }while(envy);
            System.out.println("Merci d'avoir joué");
        }
    }

    private static int[] move1D(char choice, int[] board)
    {

        if(choice == 'g' || choice == 'G') {
            board[ position - 1] = 1;
            board[position] = 0;
            position = position - 1;
        }
        else if(choice == 'd' || choice == 'D') {
            board[ position + 1] = 1;
            board[position] = 0;
            position = position + 1;
        }
        afficherTableau(board);
        return board;
    }

    private static int[][] move2D(char choice, int[][] board)
    {
        System.out.println("i vaut "+i+" j vaut " + j);
        if(choice == 'g' || choice == 'G') {
            board[i][j - 1] = 1;
            board[i][j] = 0;
            j = j - 1;
        }
        else if(choice == 'd' || choice == 'D') {
            board[i][j + 1] = 1;
            board[i][j] = 0;
            j = j + 1;
        }
        else if(choice == 'b' || choice == 'B') {
            board[i + 1][j] = 1;
            board[i][j] = 0;
            i = i + 1;
        }
        else if(choice == 'h' || choice == 'H') {
            board[i - 1][j] = 1;
            board[i][j] = 0;
            i = i - 1;
        }
        afficherTableau2D(board,(byte)10,(byte)10);
        return board;
    }







    private static void afficherTableau(int[] tableau) {
        int i = -1;
        System.out.print("[");
        while (++i < tableau.length)
            System.out.print(tableau[i] + (((i == (tableau.length - 1)) ? "" : ",")));
        System.out.println("]");
    }

    private static void afficherTableau2D(int[][]tab2D, byte ligne, byte colonne)
    {
        int a = -1;
        int b = -1;

        while (++a < ligne)
        {
            System.out.print("Ligne "+ (a+1) +(((a+1) == 10)?"\t":"\t\t")+"[");
            b = -1;
            while(++b < colonne)
                System.out.print(tab2D[a][b]);
            System.out.print("]\n");
        }
    }

    private static int[][] fill2Dtable(int[][] tab2D) {
        int ligne = -1, colonne = 0;
        while (++ligne < 10)
        {
            colonne = -1;
            while(++colonne < 10)
                tab2D[ligne][colonne] = 0;
        }
        tab2D[0][0]=1;
        return tab2D;
    }
}
