import java.util.Random;
import java.util.Scanner;

public class findValue {
  public static void main( String[] args ) {

    int[] val;
    val = new int[10];
    Random rand = new Random();
    Scanner inp = new Scanner(System.in);

    for (int i=0; i<10; i++) {
      val[i] = (rand.nextInt(50) + 1);
    }

    System.out.print("Array: ");
    for (int t : val) {
      System.out.print(t + " ");
    }
    System.out.print("\nValue to find: ");
    int valtofind = inp.nextInt();

    for (int n=0; n<val.length; n++) {
      if(valtofind == val[n]) {
        System.out.println(valtofind + " is in the array at position " + n);
      };
    }

  }
}
