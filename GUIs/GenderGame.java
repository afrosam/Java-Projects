import java.util.Scanner;

public class GenderGame {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    String fName, lName, gender, married;
    int age;

    System.out.print("What is your gender (M or F): ");
    gender = keyboard.next().toLowerCase();
    System.out.print("First name: ");
    fName = keyboard.next().toLowerCase();
    System.out.print("Last name: ");
    lName = keyboard.next().toLowerCase();
    System.out.print("Age: ");
    age = keyboard.nextInt();

    if (age >= 20 && gender.equals("m"))
      System.out.println("Then I shall call you Mr. " + lName + ".");
    if (age >= 20 && gender.equals("f")) {
      System.out.print("Are you married, " + fName + " (y or n)? ");
      married = keyboard.next().toLowerCase();
      if (married.equals("y"))
        System.out.println("Then I shall call you Mrs. " + lName + ".");
      if (married.equals("n"))
        System.out.println("Then I shall call you Ms. " + lName + ".");
    }
    if (age < 20 && gender.equals("m"))
      System.out.println("Then I shall call you " + fName + " " + lName);
    if (age < 20 & gender.equals("f"))
      System.out.println("Then I shall call you " + fName + " " + lName);

  }
}
