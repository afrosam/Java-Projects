public class IndividualDigits {
  public static void main( String [] args ) {
    int ans;
    for(int i=10; i<=99; i++) {
      ans = 0;
      String temp = Integer.toString(i);

      for(int t=0; t<temp.length(); t++) {
        ans += Character.getNumericValue(temp.charAt(t));

      }
      System.out.println(i + " = " + ans);
    }

  }
}
