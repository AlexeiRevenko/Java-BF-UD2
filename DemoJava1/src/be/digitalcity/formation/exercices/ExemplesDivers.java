package be.digitalcity.formation.exercices;

import java.util.HashMap;
import java.util.Map;

public class ExemplesDivers {
    public static void main(String[] args) {

        //exercice 1
        //HashMap<String[], Integer> bulletin = new HashMap<>();
        //bulletin.put(new String[]{"Didier","Caillou"}, 18);
        HashMap<String, Integer> bulletinNP = new HashMap<>();
        bulletinNP.put("CaillouDidier", 18);
        bulletinNP.put("VillamiSebastien", 20);
        bulletinNP.put("DaltonJoe", 5);
        bulletinNP.put("VertTom", 0);
        bulletinNP.put("ZuckermanEd", 13);

        int moyenne = 0;
        for (Map.Entry<String, Integer> element : bulletinNP.entrySet()) {
            moyenne = moyenne + element.getValue();
        }
        System.out.println("Moyenne de la classe " + (moyenne / bulletinNP.size()));

        HashMap<String, int[]> bulletinEleves = new HashMap<>();
        bulletinEleves.put("VortexCindy",new int []{19,19,20,19,20});
        bulletinEleves.put("NeutronJimmy",new int []{20,20,21,20,21});
        bulletinEleves.put("EstebanSheen",new int []{12,11,15,14,13});
        bulletinEleves.put("WheezerCarl",new int []{10,9,11,10,13});
        bulletinEleves.put("FolfaxLibby",new int []{16,17,18,16,18});
        for(Map.Entry<String,int[]> recup : bulletinEleves.entrySet()) {
            moyenne = 0;
            System.out.println("Eleves " + recup.getKey());
            System.out.print("Les point de l'élève sont \n[ ");
            for(int i : recup.getValue()){
                moyenne = moyenne + i;
                System.out.print(i + " ");
            }
            System.out.println("]");
            System.out.println("La moyenne de l'élève est "+moyenne/recup.getValue().length);
        }


    }
}
