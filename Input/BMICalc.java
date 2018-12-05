import java.util.Scanner;

public class BMICalc {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner( System.in );

    double height, weight;
    int feet, inches;

    System.out.print( "Your height (feet only): ");
    feet = keyboard.nextInt();
    System.out.print( "Your height (inches): " );
    inches = keyboard.nextInt();
    height = ((feet * 12) + inches) * 0.0254;
    System.out.print( "Your weight in lbs: ");
    weight = (keyboard.nextDouble() / 2.2);

    System.out.println( "Your BMI is " + (weight / (height * height)) );

  }
}
