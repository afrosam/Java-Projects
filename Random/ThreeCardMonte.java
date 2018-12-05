import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int ans = 1 + r.nextInt(3);
    int guess;

    System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
    System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
    System.out.println("He lays down the three cards.");
    System.out.println("Which one is the ace?");
    System.out.println("    ##  ##  ##");
    System.out.println("    ##  ##  ##");
    System.out.println("    1   2   3 ");

    guess = keyboard.nextInt();

    if (ans == 1 && guess == ans) {
      System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
      System.out.println("    AA  ##  ##");
    }
    else if (guess == 2 && guess == ans) {
      System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
      System.out.println("    ##  AA  ##");
    }
    else if (guess == 3 && guess == ans) {
      System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
      System.out.println("    ##  ##  AA");
    }
    else {
      System.out.println("Ha! Fast Eddie wins again! The ace was card number " + ans);
    }

  }
}
