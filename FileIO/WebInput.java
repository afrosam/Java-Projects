import java.net.URL;
import java.util.Scanner;

public class WebInput {
  public static void main( String[] args ) throws Exception {
    URL mcool = new URL("https://cs.leanderisd.org/mitchellis.txt");
    Scanner webIn = new Scanner( mcool.openStream() );

    while (webIn.hasNext()) {
    System.out.println(webIn.nextLine());
   }
   webIn.close();
  }
}
