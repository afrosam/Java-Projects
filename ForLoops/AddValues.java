import java.util.Scanner;

public class AddValues {
  public static void main ( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    int ans = 0;

    System.out.print("Number: ");
    int num = keyboard.nextInt();

    for (int i = 1; i<=num; i++) {
      ans += i;
      System.out.print(ans + " ");
    }

    System.out.println("\nThe sum is " + ans);

  }
}
