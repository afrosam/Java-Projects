import java.util.Scanner;

public class MoreInput {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner( System.in );

    String login, fname, lname, fullname;
    int ID, grade;
    double GPA;

    System.out.println( "Please enter the following information so I can sell it for profit!" );
    System.out.print( "First Name: " );
    fname = keyboard.next();
    System.out.print( "Last name: " );
    lname = keyboard.next();
    System.out.print( "Grade (9-12): " );
    grade = keyboard.nextInt();
    System.out.print( "Student ID: " );
    ID = keyboard.nextInt();
    System.out.print( "Login: " );
    login = keyboard.next();
    System.out.print( "GPA (0.0-4.0): " );
    GPA = keyboard.nextDouble();

    fullname = fname + " " + lname;

    System.out.println("Your information:");
    System.out.println("    Login: " + login);
    System.out.println("    ID: " + ID);
    System.out.println("    Name: " + fullname);
    System.out.println("    GPA: " + GPA);
    System.out.println("    Grade: " + grade);

  }
}
