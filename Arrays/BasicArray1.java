import java.util.Random;

public class BasicArray1 {
  public static void main( String[] args ) {

    int[] num;
    num = new int[1000];
    Random rando = new Random();

    for(int i=0; i<num.length; i++) {
      num[i] = (rando.nextInt(90) + 10);

      System.out.print(num[i] + "  ");
    }

  }
}
