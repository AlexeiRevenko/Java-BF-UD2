package be.digitalcity.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tableau10 {
    public static void main(String[] args) {
        ArrayList<Integer> aTrier = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int taille;
        do
        {
            System.out.println("Veuillez entrer une taille de tableau.");
            taille = sc.nextInt();
            if(taille < 0)
                System.out.println("Veuillez entrer un entier positif.");

        }while(taille < 0);
        for(int i = 0 ; i < taille ; i++)
            aTrier.add(ThreadLocalRandom.current().nextInt(-20, 20));
        aTrier.sort((x,y) -> (int) (x - y));
        boolean envy = true;
        char envie;
        do {
            for (int a : aTrier)
                System.out.print(a + " ");
            System.out.println("Voulez vous insérer une valeur ?(O/N)");
            envie = sc.next().charAt(0);
            if (envie == 'O' || envie == 'o'){
                System.out.println("Veuillez entrer un entier à insérer dans le tableau");
                taille = sc.nextInt();
                aTrier.add(taille);
                aTrier.sort((x,y) -> (int) (x - y));
            }
            else if(envie == 'n' || envie == 'N') {
                System.out.println("Daccord, merci d'avoir joué");
                envy = false;
            }
            else
                System.out.println("Veuillez rentrer l'un des choix proposés, en majuscule ou en minuscule ");
        }while(envy);
    }

    private static void insertValue(int[] tableau, int t){





    }



}
