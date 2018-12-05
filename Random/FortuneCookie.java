import java.util.Random;
import java.util.Scanner;

public class FortuneCookie {
  public static void main( String[] args ) {

    Random r = new Random();
    int fortune = 1 + r.nextInt(6);
    int randNum1 = 1 + r.nextInt(54);
    int randNum2 = 1 + r.nextInt(54);
    int randNum3 = 1 + r.nextInt(54);
    int randNum4 = 1 + r.nextInt(54);
    int randNum5 = 1 + r.nextInt(54);
    int randNum6 = 1 + r.nextInt(54);

    if (fortune == 1) {
      System.out.println("Stick with your wife.");
    }
    else if (fortune == 2) {
      System.out.println("Just stay in bed tomorrow.");
    }
    else if (fortune == 3) {
      System.out.println("You rely too much on others for assurance.");
    }
    else if (fortune == 4) {
      System.out.println("Happiness will soon be in your path.");
    }
    else if (fortune == 5) {
      System.out.println("Drink more ovaltine.");
    }
    else if (fortune == 6) {
      System.out.println("Life is a game of give and take. Dont forget to do your share of both.");
    }

    System.out.println(randNum1 + " " + randNum2 + " " + randNum3 + " " + randNum4 + " " + randNum5 + " " + randNum6);

  }
}
