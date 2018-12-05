public class reverse {
  public static void main( String[] args ) {

    String test = "Hello World!";
    String reverse = new StringBuffer(test).reverse().toString();
    String reverse2 = new StringBuilder(test).reverse().toString();
    System.out.println(reverse);

  }
}
