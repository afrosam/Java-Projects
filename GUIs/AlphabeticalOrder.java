import java.util.Scanner;

public class AlphabeticalOrder {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    String lName;

    System.out.print("What's your last name? ");
    lName = keyboard.next().toLowerCase();

    if (lName.compareTo("carswell") <= 0) {
      System.out.println("you dont have to wait long");
    }
    else if (lName.compareTo("jones") <= 0) {
      System.out.println("that's not bad");
    }
    else if (lName.compareTo("smith") <= 0) {
      System.out.println("looks like a bit of a wait");
    }
    else if (lName.compareTo("young") <= 0) {
      System.out.println("it's gonna be a while");
    }
    else if (lName.compareTo("young") > 0) {
      System.out.println("not going anywhere for a while?");
    }

  }
}
