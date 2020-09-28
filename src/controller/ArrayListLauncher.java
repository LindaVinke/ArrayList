package controller;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht 6.2
 * <p>
 * Doel: uitwerken van verschillende oefenopdrachten
 */
public class ArrayListLauncher {

    public static void main(String[] args) {

        // opdracht 1
        ArrayList<String> woordenlijst = new ArrayList<>();
        woordenlijst.add("Morgen ");
        woordenlijst.add("wordt ");
        woordenlijst.add("het ");
        woordenlijst.add("mooi ");
        woordenlijst.add("weer ");
        for (String woord : woordenlijst) {
            System.out.print(woord);
        }
        System.out.println();
        woordenlijst.remove(1);
        woordenlijst.add(1, "is ");
        for (String woord : woordenlijst) {
            System.out.print(woord);
        }
        System.out.println();

        // opdracht 2
        ArrayList<Integer> lijstGetallen;
        lijstGetallen = maakRandomRijGetallen(5, 50);
        System.out.println(lijstGetallen);

        // opdracht 3
        System.out.println(somVanRij(lijstGetallen));


    }

    // methode opdracht 2
    public static ArrayList<Integer> maakRandomRijGetallen(int aantal, int maximum) {
        ArrayList<Integer> lijstGetallen = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < aantal; i++) {
            lijstGetallen.add(generator.nextInt(maximum));
        }
        return lijstGetallen;
    }

    // methode opdracht 3
    public static int somVanRij(ArrayList<Integer> rij) {
        int som = 0;
        for (Integer getal : rij) {
            som += getal;
        }
        return som;
    }

}




