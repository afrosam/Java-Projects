import java.util.Scanner;

public class BabyNim {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    String category;
    int A, B, C, num;

    A = 3;
    B = 3;
    C = 3;

    do {
    System.out.println("A: " + A + "  B: " + B + "  C: " + C);
    System.out.print("Choose a pile: ");
    category = keyboard.next().toUpperCase();
    if (category.equals("A")) {
      System.out.print("How many to remove from pile A: ");
      num = keyboard.nextInt();
      A -= num;
    }
    else if (category.equals("B")) {
      System.out.print("How many to remove from pile B: ");
      num = keyboard.nextInt();
      B -= num;
    }
    else if (category.equals("C")) {
      System.out.print("How many to remove from pile C: ");
      num = keyboard.nextInt();
      C -= num;
    }
    else {
      System.out.println("Sorry, input error. Please try again.");
    }

    }
    while (A >= 1 || B >= 1 || C >= 1);

    System.out.println("\nA: " + A + "  B: " + B + "  C: " + C);
    System.out.println("All piles are empty. Good Job!");

  }
}
