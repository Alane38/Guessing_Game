package Lib;
import java.io.*;

public class Lire {

  /**********************************************************/
  public static String lireString() // Lire un String
  {
    String tmp = "";
    char C = '\0';
    try {
      while ((C = (char) System.in.read()) != '\n') {
        if (C != '\r')
          tmp = tmp + C;

      }
    } catch (IOException e) {
      System.out.println("Erreur de frappe");
      System.exit(0);
    }
    return tmp;
  }

  /**********************************************************/
  public static int lireInt() // Lire un entier
  {
    int x = 0;
    try {
      x = Integer.parseInt(lireString());
    } catch (NumberFormatException e) {
      System.out.println("Format numérique incorrect");
      System.exit(0);
    }
    return x;
  }

  /**********************************************************/  
  /**********************************************************/
  public static int lireIntGame() // Lire un entier
  {
    int x = 0;
    try {
      x = Integer.parseInt(lireString());
    } catch (NumberFormatException e) {
      System.out.println("Format numérique incorrect");
    }
    return x;
  }

  /**********************************************************/
  public static double lireDouble() // Lire un double
  {
    double x = 0;
    try {
      x = Double.valueOf(lireString()).doubleValue();
    } catch (NumberFormatException e) {
      System.out.println("Format numérique incorrect");
      System.exit(0);
    }
    return x;
  }

  /**********************************************************/
  public static char lireChar() // Lire un caractere
  {
    String tmp = lireString();
    if (tmp.length() == 0)
      return '\n';
    else {
      return tmp.charAt(0);
    }
  }
}
