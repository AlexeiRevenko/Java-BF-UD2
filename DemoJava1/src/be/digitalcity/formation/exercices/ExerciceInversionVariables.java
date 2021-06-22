package be.digitalcity.formation.exercices;

public class ExerciceInversionVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("Inversion de variables");
        System.out.println("A vaut " +a+", B vaut "+b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A vaut " +a+", B vaut "+b );
    }
}
