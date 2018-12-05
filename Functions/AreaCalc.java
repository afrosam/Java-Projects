import java.util.Scanner;

public class AreaCalc {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    int menuItem;
    double area = 0.0;

    System.out.println("Shape Area Calculator version 0.1 (c)");
    do {
      System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.println("\n1) Triangle");
      System.out.println("2) Rectangle");
      System.out.println("3) Square");
      System.out.println("4) Circle");
      System.out.println("5) Quit");
      System.out.print("Which shape: ");
      menuItem = keyboard.nextInt();

      if (menuItem == 1) {

        int base, height;

        System.out.print("Base: ");
        base = keyboard.nextInt();
        System.out.print("Height: ");
        height = keyboard.nextInt();

        area = area_triangle(base, height);

      }
      else if (menuItem == 2) {

        int length, width;

        System.out.print("Length: ");
        length = keyboard.nextInt();
        System.out.print("Width: ");
        width = keyboard.nextInt();

        area = area_rectangle(length, width);

      }
      else if (menuItem == 3) {

        int side;

        System.out.print("Side Length: ");
        side = keyboard.nextInt();

        area = area_square(side);

      }
      else if (menuItem == 4) {

        int radius;

        System.out.print("Radius: ");
        radius = keyboard.nextInt();

        area = area_circle(radius);

      }


    }
    while (menuItem != 5);

  }
  public static double area_circle( int radius ) {

    double area = (Math.PI * (radius * radius));

    return area;

  }
  public static int area_rectangle( int length, int width ) {

    int area = (length * width);

    return area;

  }
  public static int area_square( int side ) {

    int area = (side * side);

    return area;

  }
  public static double area_triangle( int base, int height ) {

    double area = ((base * height) * .5);
    return area;

  }
}
