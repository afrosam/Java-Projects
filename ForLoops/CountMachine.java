import java.util.Scanner;

public class CountMachine {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    int start, to, by;

    System.out.print("Count from: ");
    start = keyboard.nextInt();
    System.out.print("Count to  : ");
    to = keyboard.nextInt();
    System.out.print("Count by  : ");
    by = keyboard.nextInt();


    for ( int i = start; i <= to; i+=by ) {
      System.out.print(i + " ");
    }
  }
}
