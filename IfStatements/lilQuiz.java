import java.util.Scanner;

public class lilQuiz {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner( System.in );
    int a, b, c;

    System.out.println("Q1) What is the capital of Alaska?");
    System.out.println("    1) Melbourne");
    System.out.println("    2) Anchorage");
    System.out.println("    3) Juneau");
    a = keyboard.nextInt();
    if ( a == 2 ) {
      System.out.println("That's right!");
    }
    else {
      System.out.println("That's wrong!");
    }

    System.out.println("Q2) Can you store the value 'cat' in a variable of type int?");
    System.out.println("    1) yes");
    System.out.println("    2) no");
    b = keyboard.nextInt();
    if ( b == 2 ) {
      System.out.println("That's right!");
    }
    else {
      System.out.println("That's wrong!");
    }

    System.out.println("Q3) What is the result of 9+6/3?");
    System.out.println("    1) 5");
    System.out.println("    2) 11");
    System.out.println("    3) 15/3");
    c = keyboard.nextInt();
    if ( c == 2 ) {
      System.out.println("That's right!");
    }
    else {
      System.out.println("That's wrong!");
    }

  }
}
