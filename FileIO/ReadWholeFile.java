import java.util.Scanner;
import java.io.*;

public class ReadWholeFile {
  public static void main( String[] args ) throws Exception {
    Scanner kb = new Scanner(System.in);
    System.out.print("Open which file: ");
    String filename = kb.next();
    Scanner file = new Scanner(new File(filename));

    while (file.hasNext()) {
      System.out.println(file.nextLine());
    }

  }
}
