import java.util.Scanner;

public class TwoMoreQuestions {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    String ans1, ans2, finalAns;

    System.out.println("TWO MORE QUESTIONS, BABY!");
    System.out.println("Think of something and I'll try to guess it!");
    System.out.print("Question 1) Does it stay inside or outside or both? ");
    ans1 = keyboard.next().toLowerCase();
    System.out.print("Question 2) Is it a living thing? ");
    ans2 = keyboard.next().toLowerCase();
    finalAns = "";

    if (ans1.equals("inside") && ans2.equals("yes")) {
      finalAns = "houseplant";
    }
    if (ans1.equals("inside") && ans2.equals("no")) {
      finalAns = "shower curtain";
    }
    if (ans1.equals("outside") && ans2.equals("yes")) {
      finalAns = "bison";
    }
    if (ans1.equals("outside") && ans2.equals("no")) {
      finalAns = "billboard";
    }
    if (ans1.equals("both") && ans2.equals("yes")) {
      finalAns = "dog";
    }
    if (ans1.equals("both") && ans2.equals("no")) {
      finalAns = "cell phone";
    }


    System.out.println("Then what else could you be thinking of besides a " + finalAns);

  }
}
