import java.util.Scanner;

public class Age {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int Age;

    System.out.print("Hey, what's your name? ");
    name = keyboard.next();
    System.out.print( "Ok, " + name + ", how old are you? " );
    Age = keyboard.nextInt();

    if ( Age < 16 ) {
      System.out.println("you can't drive, " + name);
    }
    if ( Age < 18 ) {
      System.out.println("you can drive but can't vote, " + name);
    }
    if ( Age < 21 ) {
      System.out.println("you can vote but can't drink, " + name);
    }
    if ( Age < 25 ) {
      System.out.println("you can drink but can't rent a car, " + name);
    }
    else if ( Age >= 25 ) {
      System.out.println("you can do anything that's legal!");
    }

  }
}
