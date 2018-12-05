public class BasicArray2 {
  public static void main( String[] args ) {

    int[] num;
    num = new int[10];

    for(int i=0; i<num.length; i++) {
      num[i] = -113;
      System.out.println("Slot " + i + " contains a " + num[i]);
    }

  }
}
