import java.util.Scanner;

public class Forgetful {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner( System.in );

    System.out.print( "Give me a word! " );
    keyboard.next();
    System.out.print( "Give me another word! " );
    keyboard.next();
    System.out.print( "Great, now your favorite number? " );
    keyboard.nextInt();
    System.out.print( "And your second-favorite number... " );
    keyboard.nextInt();

    System.out.println( "Whew! Wasn't that fun?" );

  }
}
