public class XsYs {
  public static void main( String[] args ) {

    System.out.println("x    y      ");
    System.out.println("------------");

    for (double i = -10.0; i <= 10.0; i+= 0.5) {
      double ans = i * i;
      System.out.println(i + "  " + ans);
    }

  }
}
