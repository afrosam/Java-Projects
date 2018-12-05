import java.util.Scanner;

public class WorstNumGuessingGame {
  public static void main( String[] args ){

    Scanner keyboard = new Scanner(System.in);
    int num = 5;
    int guess;

    System.out.println("The worst number guessing game ever!");
    System.out.print("I am think of a number between 1 and 10. Try to guess what it is: ");
    guess = keyboard.nextInt();

    if (guess == num)
      System.out.println("Wow! It was " + num + "! You got it! Way to go! :)");
    if (guess != num)
      System.out.println("Sorry, wrong answer! It was actually " + num);

  }
}
