import java.util.Scanner;

public class ShowEtoile {
    public static void main(String[] args) {

        int compteurEtape = 0, compteurEtoile = 0, entree = 0;
        boolean checkPos = true;
        Scanner recup = new Scanner(System.in);

        while(checkPos) {
            System.out.println("Veuillez entrer un entier positif.");
            entree = recup.nextInt();
            if (entree >= 0)
                checkPos = false;
            else
                System.out.println("Le nombre que vous avez entré n'est pas conforme. \n " + "Veuillez réessayer et entrer un entier positif");
        }

        while(compteurEtape++ < entree) {
            compteurEtoile = 0;
            while(compteurEtoile++ < compteurEtape)
                System.out.print("*");
            System.out.println("");
        }
    }
}
