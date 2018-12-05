public class NumberPuzzle {
  public static void main( String[] args ) {
    for(int i=10; i<=50; i++) {
      for(int t=50; t>=10; t--) {
        if ((i + t == 60) && (t - i == 14)) {
          System.out.print(i + " " + t + "  ");
        }
      }
    }
  }
}
