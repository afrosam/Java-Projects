import java.util.Scanner;
import java.util.Random;

public class HiLo {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int ans = 1 + r.nextInt(100);
    int guess;


    System.out.println("I'm thinking of a number between 1-100. Try to guess what it is.");
    guess = keyboard.nextInt();

    if (guess == ans) {
      System.out.println("You guessed it! What are the odds?!?");
    }
    else if (guess > ans) {
      System.out.println("Sorry, your guess was too high. I was thinking of " + ans);
    }
    else if (guess < ans) {
      System.out.println("Sorry, your guess was too low. I was thinking of " + ans);
    }


  }
}
