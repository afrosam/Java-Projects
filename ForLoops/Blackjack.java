import java.util.Random;
import java.util.Scanner;

public class Blackjack {
  public static void main( String[] args ) {
    Random r = new Random();
    Scanner keyboard = new Scanner(System.in);
    int hand1, hand2, deal1, deal2, total, dealTotal;
    String move = "";
    boolean p1 = true;
    boolean p2 = true;

    hand1 = 1 + r.nextInt(10);
    hand2 = 1 + r.nextInt(10);
    deal1 = 1 + r.nextInt(10);
    deal2 = 1 + r.nextInt(10);
    total = (hand1 + hand2);
    dealTotal = (deal1 + deal2);

    System.out.println("You drew " + hand1 + " and " + hand2 + ".");

    do {
      // players turn
      if (p1 == true) {
        System.out.println("You drew a " + hand2 + ".");
        System.out.println("Your total is " + total + ".");
        System.out.println("\nThe dealer is showing a " + deal2 + ".");
        System.out.println("Would you like to 'hit' or 'stay'?");
        move = keyboard.next().toLowerCase();

      if (move.equals("hit")) {
        int draw = 1 + r.nextInt(10);
        total += draw;
        hand2 = draw;
      }
      else if (move.equals("stay")) {
        p1 = false;
        System.out.println("Okay, dealer's turn.");
        System.out.println("His hidden card was " + deal1);
        System.out.println("His total was " + dealTotal);
      }
      // break loop if players hand breaks 21
      else if (total > 21)
        p1 = false;

      }
      // Dealers turn
      else if (p1 == false) {

        if (dealTotal <= 16) {
          int hit = 1 + r.nextInt(10);
          dealTotal += hit;
          System.out.println("\nThe Dealer hits.");
          System.out.println("His new total is " + dealTotal);
        }
        else if (dealTotal > 16 && dealTotal <= 21) {
          p2 = false;
          System.out.println("The Dealer stays.");
        }
        // break loop if dealers hand breaks 21
        else if (dealTotal > 21)
          p2 = false;

      }
    }
    // while these conditions are true, keep looping
    while ((total < 22 && dealTotal < 22) && (p1 == true || p2 == true));
    // win conditions
    if (total > 21) {
      System.out.println(total + " PLAYER BUST");
    }
    else if (dealTotal > 21) {
      System.out.println(dealTotal + " DEALER BUST");
    }
    else if (total > dealTotal) {
      System.out.println(total + " beats dealer's " + dealTotal );
      System.out.println("\nYOU WIN");
    }
    else if (total < dealTotal) {
      System.out.println(dealTotal + " beats player's " + total);
      System.out.println("\nYOU LOSE");
    }

  }
}
