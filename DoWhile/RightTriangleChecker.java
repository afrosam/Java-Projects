import java.util.Scanner;

public class RightTriangleChecker {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    int count = 0;
    int ang1, ang2, ang3;

    do {
      System.out.print("Side 1: ");
      ang1 = keyboard.nextInt();
      if (ang1 <= 0)
        System.out.println("Sorry, side 1 must be a positive number and greater than zero.");
    }
    while (ang1 <= 0);
    do {
      System.out.print("Side 2: ");
      ang2 = keyboard.nextInt();
      if (ang2 < ang1)
        System.out.println("Sorry, side 2 must not be smaller than side 1.");
    }
    while (ang2 < ang1);
    do {
      System.out.print("Side 3: ");
      ang3 = keyboard.nextInt();
      if (ang3 < ang2)
        System.out.println("Sorry, side 3 must not be smaller than side 2.");
    }
    while (ang3 < ang2);

    System.out.println("Your three sides are " + ang1 + " " + ang2 + " " + ang3 );
    System.out.println("These side DO make a right triangle. woohoo!");

  }
}
