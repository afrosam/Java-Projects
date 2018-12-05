import java.util.Scanner;

public class Age3 {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    int age;
    String name;

    System.out.print("Your name: ");
    name = keyboard.next().toLowerCase();
    System.out.print("Your age: ");
    age = keyboard.nextInt();

    if (age < 16) {
      System.out.println("You can't drive.");
    }
    if (age >= 16 && age < 18) {
      System.out.println("You can drive but not vote.");
    }
    if (age >= 18 && age < 25) {
      System.out.println("You can vote but not rent a car.");
    }
    if (age >= 25) {
      System.out.println("You can do pretty much anything.");
    }

  }
}
