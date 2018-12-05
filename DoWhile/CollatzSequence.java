import java.util.Scanner;

public class CollatzSequence {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    int uno;
    int count = 0;

    count++;
    System.out.print("Starting number: ");
    uno = keyboard.nextInt();
    System.out.print(uno);

    do {
      if ((uno % 2) == 0) {
        uno /= 2;
      }
      else if ((uno % 2) == 1) {
        uno *= 3;
        uno += 1;
      }
      System.out.print("  " + uno);
      count++;
    }
    while (uno != 1);

    System.out.println("\nIt took a total of " + count + " steps.");
  }
}
