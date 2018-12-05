import java.util.Scanner;

public class SpaceBoxing {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner( System.in );
    int weight, planetNum;
    double planetWeight = 0;

    System.out.print("Please enter your current earth weight: ");
    weight = keyboard.nextInt();
    System.out.println("I have information for the following planets: ");
    System.out.println("  1. Venus  2. Mars   3. Jupiter");
    System.out.println("  2. Saturn 5. Uranus 6. Neptune");

    System.out.print("Which planet are you visiting? ");
    planetNum = keyboard.nextInt();

    if ( planetNum == 1 ) {
      planetWeight = weight * .78;
    }
    else if ( planetNum == 2 ) {
      planetWeight = weight * .39;
    }
    else if ( planetNum == 3 ) {
      planetWeight = weight * 2.65;
    }
    else if ( planetNum == 4 ) {
      planetWeight = weight * 1.17;
    }
    else if ( planetNum == 5 ) {
      planetWeight = weight * 1.05;
    }
    else if ( planetNum == 6 ) {
      planetWeight = weight * 1.23;
    }

    System.out.println("Your weight would be " + planetWeight + " pounds on that planet");

  }
}
