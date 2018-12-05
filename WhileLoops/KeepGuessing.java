import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
  public static void main( String[] args ){

    Random r = new Random();
    Scanner keyboard = new Scanner(System.in);
    int num = 1 + r.nextInt(10);
    int guess;

    System.out.println("Welcome to the number guessing game!");
    System.out.print("I am think of a number between 1 and 10. Try to guess what it is: ");
    guess = keyboard.nextInt();

    while (guess != num) {
    System.out.println("Sorry, wrong answer! Guess again.");
    guess = keyboard.nextInt();
    }
    System.out.println("Wow! It was " + num + "! You got it! Way to go! :)");
  }
}
