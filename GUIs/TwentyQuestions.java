import java.util.Scanner;

public class TwentyQuestions {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner( System.in );
    String ans1, ans2;

    System.out.println("TWO QUESTIONS!");
    System.out.println("Think of an object, and I'll try to guess it.");
    System.out.println("Question 1) Animal, vegetable, or mineral?");
    ans1 = keyboard.next().toLowerCase();
    System.out.println("Question 2) Is it bigger than a breadbox?");
    ans2 = keyboard.next().toLowerCase();

    if ( ans1.equals("animal") ) {
      if ( ans2.equals("yes") ) {
        System.out.println("My Guess is that you are thinking of a Moose!");
      }
      else if ( ans2.equals("no") ) {
        System.out.println("My Guess is that you are thinking of a squirrel!");
      }
      else {
        System.out.println("There was an error with the 2nd question's input. Please try again.");
      }
    }
   if ( ans1.equals("vegetable") ) {
      if ( ans2.equals("yes") ) {
        System.out.println("My Guess is that you are thinking of a watermelon!");
      }
      else if ( ans2.equals("no") ) {
        System.out.println("My Guess is that you are thinking of a carrot!");
      }
      else {
        System.out.println("There was an error with the 2nd question's input. Please try again.");
      }
    }
   if ( ans1.equals("mineral") ) {
      if ( ans2.equals("yes") ) {
        System.out.println("My Guess is that you are thinking of a Camaro!");
      }
      else if ( ans2.equals("no") ) {
        System.out.println("My Guess is that you are thinking of a paper clip!");
      }
      else {
        System.out.println("There was an error with the 2nd question's input. Please try again.");
      }
    }

    System.out.println("I would ask you if I'm right, but I don't actually care.");

  }
}
