import java.util.Scanner;

public class WeekdayCalendar {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to Mr. MItchell's fantastic birth-o-meter");
    System.out.println("All you have to do is enter your birthday, and it will tell you\n the day of the week on which you were born.");
    System.out.println("Now it's your turn! What's your birthday?");
    System.out.print("Birthday (mm dd yyyy): ");
    int month = keyboard.nextInt();
    System.out.print(" ");
    int Day = keyboard.nextInt();
    System.out.print(" ");
    int Year = keyboard.nextInt();

    String birthDay = WeekdayCalc(month, Day, Year);

    System.out.println(birthDay);
  }
  // weekday calculator
  public static String WeekdayCalc(int mon, int monthDay, int birthYear) {

    int offset = month_offset(mon);
    int yy = (birthYear - 1900);
    int total = ((((yy / 4) + yy) + monthDay) + offset);
    String weekday = "";
    String  monthname = "";
    String result = "";

    if (is_leap(birthYear) && (mon == 1 || mon == 2)) {
      total -= 1;
    }

    int remains = total % 7;
    weekday = weekday_name(remains);
    monthname = month_name(mon);

    result = "You were born on " + weekday + ", " + monthname + " " + monthDay + ", " + birthYear + "!";
    return result;

  }
  // month offset
  public static int month_offset( int month )
	{
		int result;

    if (month == 1 || month == 10)
      result = 1;
    else if (month == 2 || month == 3 || month == 11)
      result = 4;
    else if (month == 4 || month == 7)
      result = 0;
    else if (month == 5)
      result = 2;
    else if (month == 6)
      result = 5;
    else if (month == 8)
      result = 3;
    else if (month == 9 || month == 12)
      result = 6;
    else
      result = -1;

		return result;
	}
  // leap year function
  public static boolean is_leap( int year )
	{
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;

		return result;
	}
  // week day name
  public static String weekday_name(int weekday) {

        String result = "";

        if (weekday == 1) {
            result = "Sunday";
        } else if (weekday == 2) {
            result = "Monday";
        } else if (weekday == 3) {
            result = "Tuesday";
        } else if (weekday == 4) {
            result = "Wednesday";
        } else if (weekday == 5) {
            result = "Thursday";
        } else if (weekday == 6) {
            result = "Friday";
        } else if (weekday == 7) {
            result = "Saturday";
        } else if (weekday == 0) {
            result = "Saturday";
          }

        return result;

  }
  // month name function
  public static String month_name( int month )
	{
		String result = "";
		// Your code goes in here.

    if (month == 1)
      result = "January";
    else if (month == 2)
      result = "February";
    else if (month == 3)
      result = "March";
    else if (month == 4)
      result = "April";
    else if (month == 5)
      result = "May";
    else if (month == 6)
      result = "June";
    else if (month == 7)
      result = "July";
    else if (month == 8)
      result = "August";
    else if (month == 9)
      result = "September";
    else if (month == 10)
      result = "October";
    else if (month == 11)
      result = "November";
    else if (month == 12)
      result = "December";

		return result;
	}
}
