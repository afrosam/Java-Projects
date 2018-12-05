import java.io.*;
import java.util.Scanner;

public class SummonThree {
  public static void main( String[] args ) throws Exception {
    System.out.print("Which file would you like to read numbers from: ");
    Scanner kb = new Scanner(System.in);
    String filename = kb.next();
    Scanner filein = new Scanner(new File(filename));
    System.out.println("Reading numbers from file \"" + filename + "\"\n" );

    int a = filein.nextInt();
    int b = filein.nextInt();
    int c = filein.nextInt();

    int sum = (a + b + c);

    System.out.println(a + " + " + b + " + " + c + " = " + sum);
    filein.close();

  }
}
