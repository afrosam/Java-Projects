import java.util.Scanner;

public class AddValues {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    int total = 0;
    int end = 1;

    System.out.println("I will add up the numbers you give me.");
    System.out.println("pass in 0 for the answer.");
    System.out.print("Number: ");
    total = keyboard.nextInt();
    System.out.println("The Total so far is " + total);

    while ( end != 0 ) {
      System.out.print("Number: ");
      end = keyboard.nextInt();
      if (end != 0) {
        total += end;
        System.out.println("The Total so far is " + total);
      }
    }

    System.out.println("The total is " + total);
  }
}
