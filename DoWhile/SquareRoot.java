import java.util.Scanner;

public class SquareRoot {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    int num;
    double sqrt = 0.0;

    System.out.println("SQUARE ROOT!");
    System.out.print("Enter a number: ");
    num = keyboard.nextInt();

    do {
      if (num >= 1) {
        sqrt = Math.sqrt(num);
        System.out.println("The square root of " + num + " is " + sqrt);
      }
      else {
        System.out.println("You can't take the square root of a negative number or 0, silly.");
        System.out.print("Try again: ");
        num = keyboard.nextInt();
      }
    }
    while (sqrt == 0.0);

  }
}
