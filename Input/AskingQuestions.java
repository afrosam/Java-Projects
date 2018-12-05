import java.util.Scanner;

public class AskingQuestions {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner (System.in);

    int age, height, heightInches;
    double weight;

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();

    System.out.print( "How tall are you in feet? " );
    height = keyboard.nextInt();

    System.out.print( "How many inches are left over after feet?" );
    heightInches = keyboard.nextInt();

    System.out.print( "How much do you weigh? " );
    weight = keyboard.nextDouble();

    System.out.println( "So you're " + age + " years old, " + height + "'" + heightInches + " tall and weigh " + weight + " lbs." );

  }
}
