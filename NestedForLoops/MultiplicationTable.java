public class MultiplicationTable {
  public static void main( String[] args ) {
    System.out.println("x | 1   2   3   4   5   6   7   8   9   ");
    System.out.println("==+=====================================");

    for (int i=1; i<=12; i++) {
      System.out.print(i + " | ");
      for (int t=1; t<=9; t++) {
        int ans = (i * t);
        System.out.print(ans + "\t");
      }
      System.out.print("\n");
    }

  }
}
