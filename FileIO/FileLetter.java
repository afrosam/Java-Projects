import java.io.*;

public class FileLetter {
  public static void main( String[] args ) {

    try {
    PrintWriter line = new PrintWriter(new FileWriter("letter.txt"));

    line.println("+ - - - - - - - - - - - - - - - - - - - - +");
    line.println("|                                    ###  |");
    line.println("|                                    ###  |");
    line.println("|                                    ###  |");
    line.println("|                                         |");
    line.println("|                                         |");
    line.println("|                     Sam Trettin         |");
    line.println("|                     123 guesswhere way  |");
    line.println("|                     wichitah, KS 12345  |");
    line.println("|                                         |");
    line.println("+ - - - - - - - - - - - - - - - - - - - - +");
    line.close();
    }
    catch(IOException e) {
      System.out.println("Sorry, IOException Error. " + e.getMessage());
    }

  }
}
