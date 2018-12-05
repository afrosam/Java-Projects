public class VarsAndNames {
  public static void main( String[] args ) {
    // creates 5 variables under the int data type
    int cars, drivers, passengers, cars_not_driven, cars_driven;
    // creates 3 variables under the double data type
    double space_in_a_car, carpool_capacity, average_passengers_per_car;

    // assigns values to currently null value variables
    cars = 100;
    space_in_a_car = 4.0;
    drivers = 30;
    passengers = 90;
    cars_not_driven = cars - drivers;
    cars_driven = drivers;
    carpool_capacity = cars_driven * space_in_a_car;
    average_passengers_per_car = passengers / cars_driven;

    // print 6 lines with string/variable values
    System.out.println( "There are " + cars + " cars available." );
    System.out.println( "There are only " + drivers + " drivers available." );
    System.out.println( "There will be " + cars_not_driven + " empty cars today." );
    System.out.println( "We can transport " + carpool_capacity + " people today." );
    System.out.println( "We have " + passengers + " to carpool today." );
    System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );

  }
}
