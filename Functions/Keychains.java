import java.util.Scanner;

public class Keychains {
  public static void main( String[] args ) {

    int choice = 0;
    int numberOfChains = 0;
    int price = 10;
    double total = 0;
    double salesTax = 1.0825; //1.0825 or 8.25%
    double shippingCost = 5.00;
    double additionalKeychain = 1.00;

    System.out.println("Ye Olde Keychain Shoppe");

    while (choice != 4) {

      choice = Menu();
      if (choice < 1 || choice > 4) {
        System.out.println("Menu input error. Please try again.");
        choice = Menu();
      }
      else {

      if (choice == 1) {
        numberOfChains = add_keychains(numberOfChains);
        System.out.println("You now have " + numberOfChains + " keychains.");
      }
      else if (choice == 2) {
        numberOfChains = remove_keychains(numberOfChains);
        System.out.println("You now have " + numberOfChains + " keychains.");
      }
      else if (choice == 3) {
        view_order(numberOfChains, price, salesTax, shippingCost, additionalKeychain);
      }
     }
    }

    checkout(numberOfChains, price, salesTax, shippingCost, additionalKeychain);
  }

  public static int Menu() {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("\n1. Add Keychains to Order");
    System.out.println("2. Remove Keychains from Order");
    System.out.println("3. View Current Order");
    System.out.println("4. Checkout\n");
    System.out.print("Please enter your choice: ");
    int choice = keyboard.nextInt();

    return choice;
  }

  public static int add_keychains( int keychains ) {
    Scanner kb = new Scanner(System.in);
    System.out.print("\nYou have " + keychains + " keychains. How many do you want to add? ");
    int newChains = kb.nextInt();
    if (newChains >= 0) {
    keychains += newChains;
    }
    else {
      System.out.println("Keychains input error. Please try again.");
      add_keychains(keychains);
    }
    return keychains;
  }

  public static int remove_keychains( int keychains ) {
    Scanner kb = new Scanner(System.in);
    System.out.print("\nYou have " + keychains + " keychains. How many would you like to remove? ");
    int newChains = kb.nextInt();
    if (newChains > keychains) {
      System.out.println("Sorry input error. You can't remove keychains you dont have. Please try again.");
      return remove_keychains(keychains);
    }
    else {
      keychains -= newChains;
    }
    return keychains;
  }

  public static void view_order( int keychains, int price, double tax, double ship, double additional ) {
    double totalShipping = ((additional * keychains) + ship);
    double total = (((keychains * price) * tax) + totalShipping);
    if (keychains == 0) {
      total = 0.00;
    }
    System.out.println("\nYou have " + keychains + " keychains.");
    System.out.println("Keychains cost $10 each.");
    System.out.println("Sales tax is 8.25%");
    System.out.println("Shipping cost is $5.00 and an additional $1.00 per keychain");
    System.out.println("Total cost is $" + total + ".");
  }

  public static void checkout( int keychains, int price, double tax, double ship, double additional ) {
    Scanner kb = new Scanner(System.in);
    System.out.print("What is your name? ");
    String user = kb.next();
    view_order(keychains, price, tax, ship, additional);
    System.out.println("Thanks for your order, " + user);
  }


}
