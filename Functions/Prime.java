public class Prime {

  public static void main( String[] args ) {
    for (int t=2; t<=20; t++) {
      if (isPrime(t)) {
        System.out.println(t + " <");
      }
      else {
        System.out.println(t);
      }
    }
  }

  public static boolean isPrime( int n ) {
    for (int i=2; i<=n; i++) {
      if (n % i == 0 && i != n) {
        return false;
      }
    }
    return true;
  }

}
