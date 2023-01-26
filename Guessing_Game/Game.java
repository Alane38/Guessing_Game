package Guessing_Game;
import Lib.Lire;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Game {
    
    public static void main(String[] args) {
        Gesser();
    }   

    public static int rand(int min, int max)
    {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range");
        }
 
        Random rand = new Random();
 
        return rand.ints(min, (max + 1)).findFirst().getAsInt();
    }

    public static void Gesser() {
        String launchGame = "";
        int number1 ;
        int number2;
        int numberRandomization;
        int numberRandomized;
        int resUser;

        System.out.println("Quel est la plus petite valeur ?");
        number1 = Lire.lireIntGame();

        System.out.println("Quel est la plus grande valeur ?");
        number2 = Lire.lireIntGame();

        numberRandomization = rand(number1, number2);
        numberRandomized = numberRandomization;
        
        do {
            System.out.println("Veuillez rentrer un nombre entre (" + number1 + " et " + number2 + ").");
            resUser = Lire.lireIntGame();
            if (resUser > number1 && resUser < number2) {
                if (resUser > numberRandomized) {
                    System.out.println("Plus petit");
                } else if (resUser == numberRandomized) {
                    System.out.println("Bravo vous avez gagné !");
                } else {
                    System.out.println("Plus grand");
                }
            } else {
                System.out.println("Vous n'avez pas rentré une valeur entre " + number1 + " et " + number2 + "!");
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {}
        } while(resUser != numberRandomized);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {}

        System.out.println("Voulez-vous recommencer ? (O/n)");
        launchGame = Lire.lireString();

        if (launchGame.equals("O") || launchGame.equals("o")) {
            Gesser();
        } else {
            System.out.println("Bye !");
        }
    }
}
