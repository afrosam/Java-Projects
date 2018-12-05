import java.util.Scanner;
import java.util.Random;

public class HiLoLimited {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int ans = 1 + r.nextInt(100);
    int guess;
    int guessNum = 0;

    System.out.println("I'm thinking of a number between 1-100. Try to guess what it is.");
    guess = keyboard.nextInt();
    guessNum++;

    while (guess != ans && guessNum < 7) {

      if (guess > ans)
        System.out.println("Sorry, your guess was too high. Guess again.");
      else if (guess < ans)
        System.out.println("Sorry, your guess was too low. Guess again.");
      guess = keyboard.nextInt();
      guessNum++;

    }

    if (guess == ans) {
      System.out.println("You guessed it! What are the odds?!?");
    }
    else if (guessNum >= 7) {
      System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
    }

  }
}
