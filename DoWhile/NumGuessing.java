import java.util.Scanner;
import java.util.Random;

public class NumGuessing {
  public static void main( String[] args ){

    Random r = new Random();
    Scanner keyboard = new Scanner(System.in);
    int num = 1 + r.nextInt(10);
    int guessNum = 0;
    int guess;

    System.out.println("I am thinking of a number between 1 and 10. Try to guess what it is: ");
    guessNum++;
    System.out.print("Your guess: ");
    guess = keyboard.nextInt();

    if (guess != num) {
      do {
        System.out.println("Sorry, wrong answer! Guess again.");
        System.out.print("Your guess: ");
        guess = keyboard.nextInt();
        guessNum++;
      }
      while (guess != num);
    }
    System.out.println("Wow! It was " + num + "! You got it! Way to go! :)");
    System.out.println("It only took you " + guessNum + " tries.");
  }
}
