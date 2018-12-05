import java.util.Random;

public class CopyArray {
  public static void main( String[] args ) {

    int[] num;
    int[] num2;
    num = new int[10];
    num2 = new int[10];
    Random rando = new Random();

    for(int i=0; i<num.length; i++) {
      num[i] = (rando.nextInt(100) + 1);
      num2[i] = num[i];
    }
    num[num.length - 1] = -7;

    System.out.print("Array 1: ");

    for(int n=0; n<num.length; n++) {
      System.out.print(num[n] + "  ");
    }

    System.out.print("\n");
    System.out.print("Array 2: ");

    for(int t=0; t<num2.length; t++) {
      System.out.print(num2[t] + "  ");
    }

  }
}
