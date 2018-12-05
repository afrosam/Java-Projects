import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Grades {
  public static void main( String[] args ) throws IOException {

    Random rando = new Random();
    Scanner kb = new Scanner(System.in);
    System.out.print("Name (first last): ");
    String name = kb.nextLine();
    System.out.print("Filename: ");
    String filename = kb.next();
    System.out.println("\nHere are your randomly-selected grades (hope you pass):");

    int[] grades;
    grades = new int[5];
    int gradeCount = 1;
    PrintWriter writer = new PrintWriter(filename, "UTF-8");
    writer.println(name);
    for (int i=0; i<grades.length; i++) {
      grades[i] = (rando.nextInt(100) + 1);
      System.out.print("Grade " + gradeCount + ": " + grades[i] + " ");
      writer.print(grades[i] + "  ");
      gradeCount++;
    }
    writer.close();
    System.out.println("Data saved in \"" + filename + "\"");

  }
}
