import java.util.Scanner;
import java.io.*;

public class SimpleInput {
  public static void main( String[] args ) {
    Scanner name = null;
    try {
      name = new Scanner(new File("test.txt"));
      while(name.hasNext()) {
        System.out.println(name.next());
      }
    }
    catch(FileNotFoundException e) {
      System.out.println("Sorry, IOException.\n" + e.getMessage());
    }

  }
}
