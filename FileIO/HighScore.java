import java.io.*;
import java.util.Scanner;

public class HighScore {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int Score = 0;
    String name = "";

    System.out.println("You got a high score!\n");
    System.out.print("Please enter your score: ");
    Score = keyboard.nextInt();
    System.out.print("Please enter your name: ");
    name = keyboard.next();

    try {
    PrintWriter record = new PrintWriter(new FileWriter("score.txt"));
    record.println(name);
    record.println(Score);
    record.close();
    }
    catch(IOException e) {
      System.out.println("Sorry, IOException.\n" + e.getMessage());
    }


  }
}
