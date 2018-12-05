import java.util.Scanner;

public class CallingFunctionsFromOtherFiles {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to Mr. MItchell's fantastic birth-o-meter");
    System.out.println("All you have to do is enter your birthday, and it will tell you\n the day of the week on which you were born.");
    System.out.println("Now it's your turn! What's your birthday?");
    System.out.print("Birthday (mm dd yyyy): ");
    int month = keyboard.nextInt();
    System.out.print(" ");
    int day = keyboard.nextInt();
    System.out.print(" ");
    int year = keyboard.nextInt();

    String birthDay = WeekdayCalc(month, day, year);

    System.out.println(birthDay);
  }
  // weekday calculator
  public static String WeekdayCalc(int mon, int monthDay, int birthYear) {

    int offset = MonthOffset.month_offset(mon);
    int yy = (birthYear - 1900);
    int total = ((((yy / 4) + yy) + monthDay) + offset);
    String weekday = "";
    String  monthname = "";
    String result = "";

    if (WeekdayCalendar.is_leap(birthYear) && (mon == 1 || mon == 2)) {
      total -= 1;
    }

    int remains = total % 7;
    weekday = WeekdayName.weekday_name(remains);
    monthname = MonthName.month_name(mon);

    result = "You were born on " + weekday + ", " + monthname + " " + monthDay + ", " + birthYear + "!";
    return result;

  }

}
