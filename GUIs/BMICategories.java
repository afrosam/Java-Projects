import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner( System.in );

    String category;
    double height, weight, BMI;
    int feet, inches;

    System.out.print( "Your height (feet only): ");
    feet = keyboard.nextInt();
    System.out.print( "Your height (inches): " );
    inches = keyboard.nextInt();
    height = ((feet * 12) + inches) * 0.0254;
    System.out.print( "Your weight in lbs: ");
    weight = (keyboard.nextDouble() / 2.2);
    BMI = (weight / (height * height));
    category = "";

    if (BMI < 15.0) {
      category = "very severely underweight";
    }
    if (BMI >= 15.0 && BMI < 16.1) {
      category = "severely underweight";
    }
    if (BMI >= 16.1 && BMI <= 18.4) {
      category = "underweight";
    }
    if (BMI >= 18.5 && BMI <= 24.9) {
      category = "normal weight";
    }
    if (BMI >= 25.0 && BMI <= 29.9) {
      category = "overweight";
    }
    if (BMI >= 30.0 && BMI <= 34.9) {
      category = "moderately obese";
    }
    if (BMI >= 35.0 && BMI <= 39.9) {
      category = "severely obese";
    }
    if (BMI > 40.0) {
      category = "very severely (or 'morbidly') obese";
    }


    System.out.println( "Your BMI is " + BMI );
    System.out.println( "BMI Category: " + category );

  }
}
