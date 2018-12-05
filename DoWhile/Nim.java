import java.util.Scanner;

public class Nim {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    int A, B, C, num;
    String category, player1, player2;
    boolean p1 = true;

    System.out.print("Player 1, enter your name: ");
    player1 = keyboard.next();
    player1 = player1.substring(0,1).toUpperCase() + player1.substring(1);
    System.out.print("Player 2, enter your name: ");
    player2 = keyboard.next();
    player2 = player2.substring(0,1).toUpperCase() + player2.substring(1);
    A = 3;
    B = 3;
    C = 3;

    do {

      if (p1 == true) {

        System.out.print(player1 + ", Choose a pile: ");
        category = keyboard.next().toUpperCase();
        System.out.print("How many to remove from pile " + category + ": ");
        num = keyboard.nextInt();

        if (category.equals("A"))
          A -= num;
        else if (category.equals("B"))
          B -= num;
        else if (category.equals("C"))
          C -= num;

        p1 = false;
      }
      else if (p1 == false) {

        System.out.print(player2 + ", Choose a pile: ");
        category = keyboard.next().toUpperCase();
        System.out.print("How many to remove from pile " + category + ": ");
        num = keyboard.nextInt();

        if (category.equals("A"))
          A -= num;
        else if (category.equals("B"))
          B -= num;
        else if (category.equals("C"))
          C -= num;

        p1 = true;
      }
      System.out.println("A: " + A + "  B: " + B + "  C: " + C);
    }
    while (A >= 1 || B >= 1 || C >= 1);

    if (p1 == true)
      System.out.println(player1 + ", there are no counters left, so you WIN!");

    else if (p1 == false)
        System.out.println(player2 + ", there are no counters left, so you WIN!");

  }
}
