import java.io.*;
import java.util.Scanner;

public class littlePuzzle {
  public static void main( String[] args ) throws Exception {
    Scanner kb = new Scanner( System.in );

    System.out.print("Open which file: ");

    String file = kb.next();

    Scanner s = new Scanner(new File(file));

    String word = s.nextLine();

    for ( int y = 2; y <= word.length(); y += 3 )
    {
        char c = word.charAt(y);
        System.out.print(c);
    }
    s.close();
    System.out.println();

  }
}
