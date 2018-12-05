import java.util.Scanner;
import java.io.*;

public class VowelCap {
  public static void main( String[] args ) {
    Scanner kb = new Scanner( System.in );

    try {

    System.out.print("Open which file: ");
    String filename = kb.next();

    Scanner file = new Scanner( new File(filename) );

    while(file.hasNext()) {
      String line = file.nextLine();
      String test = "aeiou";

      for(int i=0; i<line.length(); i++) {
        char l = line.charAt(i);

        if (test.indexOf(l) != -1) {
          System.out.print(Character.toUpperCase(l));
        }
        else {
        System.out.print(l);
       }

      }
      System.out.print("\n");
    }

  }
  catch(FileNotFoundException e) {
    System.out.println(e);
  }



  }
}
