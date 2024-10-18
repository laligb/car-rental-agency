import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Audi", "A3", 2025, 4, "petrol");
        Motorcycle motorcycle1 = new Motorcycle("Yamaha", "YZF-R1", 2020, 2, "sport");
        Truck truck1 = new Truck("Ford", "F-150", 2023, 5.0f, "manual");

        System.out.println(car1);
        System.out.println(motorcycle1);
        System.out.println(truck1);
        System.out.println("");

        userAdmin();


    }

    /**
     * The method to handle user inputs and print the result
     */
    static void userAdmin() {
      Scanner scanner = new Scanner(System.in);
      boolean userInput = true;

      do {
        System.out.println("Please choose the Vehicle: car, motorcycle or truck. If you want to exit, enter 1");
        String vehicle = scanner.nextLine().toLowerCase();

        switch (vehicle) {
          case "car": {
            try {

              System.out.println("Enter make:");
              String make = scanner.nextLine();
              System.out.println("Enter model:");
              String model = scanner.nextLine();
              System.out.println("Enter year:");
              int year = scanner.nextInt();

              scanner.nextLine();

              System.out.println("Enter number of doors");
              int doors = scanner.nextInt();

              scanner.nextLine();

              System.out.println("Enter type of fuel (petrol, diesel, or electric)");
              String type = scanner.nextLine().toLowerCase();


              Car myCar = new Car(make, model, year, doors, type);
              System.out.println(myCar);
              System.out.println("");
            }
            catch (InputMismatchException e) {
                    System.err.println("Invalid input! Please enter correct values." + e);
                    scanner.nextLine();
            }

            break;
          }
          case "motorcycle": {
            try {
              System.out.println("Enter make:");
              String make = scanner.nextLine();
              System.out.println("Enter model:");
              String model = scanner.nextLine();
              System.out.println("Enter year:");
              int year = scanner.nextInt();

              scanner.nextLine();

              System.out.println("Enter number of wheels");
              int wheels = scanner.nextInt();

              scanner.nextLine();

              System.out.println("Enter type of motorcycle (sport, cruiser, off-road):");
              String type = scanner.nextLine().toLowerCase();

              Motorcycle myMoto = new Motorcycle(make, model, year, wheels, type);
              System.out.println(myMoto);
              System.out.println("");
            }
            catch (InputMismatchException e){
              System.err.println("Invalid input! Please enter correct values." + e);
              scanner.nextLine();
            }
            break;
          }
          case "truck": {
            try {
              System.out.println("Enter make:");
              String make = scanner.nextLine();
              System.out.println("Enter model:");
              String model = scanner.nextLine();
              System.out.println("Enter year:");
              int year = scanner.nextInt();

              scanner.nextLine();

              System.out.println("Enter capacity");
              float capacity = scanner.nextFloat();

              scanner.nextLine();

              System.out.println("Enter type of transmission (manual or automatic):");
              String type = scanner.nextLine().toLowerCase();


              Truck myTruck = new Truck(make, model, year, capacity, type);
              System.out.println(myTruck);
              System.out.println("");
            }
            catch (InputMismatchException e) {
              System.err.println("Invalid input! Please enter correct values." + e);
              scanner.nextLine();
            }
            break;
          }

          case "1": {
            userInput = false;
            break;
          }
          default:  {
            System.err.println("Incorrect input, please choose car, motorcycle or truck");
          }
        }
      } while (userInput);


    }
}

/**
 * Interface Vehicle that have three methods: make(), model(), and year()
 */
interface Vehicle {
  String make();
  String model();
  int year();
}

/**
 * CarVehicle interface, that have 4 methods: numberOfDoors(), fuelType(),
 * setNumberOfDoors(int doors), and setFuelType(String fuel);
 */
interface CarVehicle {
  int numberOfDoors();
  String fuelType(); // petrol, diesel, or electric
  void setNumberOfDoors(int doors); // Setter of Door's number
  void setFuelType(String fuel); // Setter of fuel type
}

/**
 * MotorVehicle interface, that have 4 methods: numberOfWheels(),
 * motorcycleType(), setNumberOfWheels(int number),
 * setMotorcycleType(String type);
}
 */
interface MotorVehicle {
  int numberOfWheels();
  String motorcycleType(); // sport, cruiser, or off-road
  void setNumberOfWheels(int number); // setter for wheel's number
  void setMotorcycleType(String type); //setter of motorcycle type
}

/**
 * TruckVehicle interface, that have 4 methods: float cargoCapacity(),
 * transmittionType(), setCartoCapacity(float capacity),
 * setTransmittionType(String type)
 */
interface TruckVehicle {
  float cargoCapacity(); // in tons
  String transmissionType(); // manual or automatic
  void setCartoCapacity(float capacity); // setter
  void setTransmissionType(String type); // setter
}

/**
 * Astract class of Vehicle, that implements of Vehicle. It contains protected
 * variables make, model, and year; Constructor, and three methods: make, model,
 * year.
 */
abstract class AbstractVehicle implements Vehicle  {
    protected String make;
    protected String model;
    protected int year;

    /**
     * Abstract Vehicle constructor
     * @param make make of vehicle in String
     * @param model model of vehicle in String
     * @param year year in integer
     */
    public AbstractVehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    /**
     * Abstract getter method that returns make of vehicle
     */
    public String make() {
      return make;
    }

    /**
     * Abstract getter method that returns model of vehicle
     */
    public String model() {
      return model;
    }

    /**
     * Abstract getter method that returns year of vehicle
     */
    public int year() {
      return year;
    }

    /**
     * Overrides the method ToString and returns information of vehicle
     */
    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}


/**
 * Class Car that extends AbstractVehicle and implements CarVehicle
 */
class Car extends AbstractVehicle implements CarVehicle  {

  private int numberOfDoors;
  private String fuel;

   /**
    * Constructor Car
    * @param make String
    * @param model String
    * @param year String
    * @param numberOfDoors int variable
    * @param fuel String
    */
   Car (
    String make,
    String model,
    int year,
    int numberOfDoors,
    String fuel
        ) {
    super(make, model, year); // Takse information from superclass
    this.numberOfDoors = numberOfDoors;
    this.fuel = fuel;
   }

   /**
    * Getter, returns number of doors
    */
   public int numberOfDoors() {
      return numberOfDoors;
   }

   /**
    * Getter, returns type of fuel
    */
   public String fuelType() {
        return fuel;
   }

  /**
   * Setter: sets number of doors
   */
  public void setNumberOfDoors(int number) {
    this.numberOfDoors = number;
  };

  /**
   * Setter: sets on of these types of fuel: petrol, diesel, or electric.
   * Catchs error if type of fuel is incorrect.
   */
  public void setFuelType(String fuel) {
    if (fuel.equals("petrol")
    || fuel.equals("diesel")
    || fuel.equals("electric")) {
      this.fuel = fuel;
    } else {
      System.err.println("Incorrect type of fuel");
    }
  };

  /**
   * Prints information about car, overrides the method from Object class.
   */
  @Override
  public String toString() {
      return "Vehicle: Car, "
      + super.toString()
      + ", Number of Doors: "
      + numberOfDoors + ", Fuel Type: "
      + fuel;
  }
}

/**
 * Class Motorcycle that extends AbstractVehicle and implements MotorVehicle
 */
class Motorcycle extends AbstractVehicle implements MotorVehicle {

  private int numberOfWheels;
  private String motorType;

  /**
   * Constructor  of Motorcycle
   * @param make String
   * @param model String
   * @param year String
   * @param numberOfWheels int
   * @param motorType String
   */
  Motorcycle (
    String make,
    String model,
    int year,
    int numberOfWheels,
    String motorType
        ) {
    super(make, model, year);
    this.numberOfWheels = numberOfWheels;
    this.motorType = motorType;
   }

  /**
   * Getter: retursn number of wheels
   */
  public int numberOfWheels() {
     return numberOfWheels;
  }

  /**
   * Getter: returns type of motorcycle
   */
  public String motorcycleType() {
       return motorType;
  }

  /**
   * Setter: sets the number of wheels
   */
  public void setNumberOfWheels(int number) {
    this.numberOfWheels = number;
  };

  /**
   * Setter: sets the type of motorcycle: sport, cruiser or off-road
   * Catchs error in case of incorrect type
   */
  public void setMotorcycleType(String type) {
    if (type.equals("sport")
    || type.equals("cruiser")
    || type.equals("off-road")) {
      this.motorType = type;
    } else {
      System.err.println("Incorrect type of motorcycle");
    }
  };

  /**
   * Overrides from Object class method ToString(). That returns information
   * about Motorcycle.
   */
  @Override
  public String toString() {
      return "Vehicle: Motorcycle, "
      + super.toString()
      + ", Number of Wheels: "
      + numberOfWheels
      + ", Motorcycle Type: "
      + motorType;
  }

}

/**
 * Class Truck that extends AbstractVehicle and implements TruckVehicle
 */
class Truck extends AbstractVehicle implements TruckVehicle {

  private float cargoCapacity;
  private String transmissionsType;

  /**
   * Constructor truck
   * @param make String
   * @param model String
   * @param year int
   * @param cargoCapacity float
   * @param transmissionsType String
   */
  Truck (
    String make,
    String model,
    int year,
    float cargoCapacity,
    String transmissionsType
        ) {
    super(make, model, year);
    this.cargoCapacity = cargoCapacity;
    this.transmissionsType = transmissionsType;
   }

  /**
   * Getter: returns capacity value in float
  */
  public float cargoCapacity() {
     return cargoCapacity;
  }

  /**
   * Getter: returns type pf transmission
   */
  public String transmissionType() {
       return transmissionsType;
  }

  /**
   * Setter: sets capacity
   */
  public void setCartoCapacity(float capacity) {
    this.cargoCapacity = capacity;
  };

  /**
   * Setter: sets type of transmission: manual or automatic
   * Handles error in case of incorrect type
   */
  public void setTransmissionType(String type) {
    if (type.equals("manual") || type.equals("automatic")) {
      this.transmissionsType = type;
    } else {
      System.err.println("Incorrect type of transmittion");
    }
  };

  /**
   * Returns information about Truck in string.
   */
  @Override
  public String toString() {
      return "Vehicle: Truck, "
      + super.toString()
      + ", Capacity: "
      + cargoCapacity
      + " tons, Transmission Type: "
      + transmissionsType;
  }
}
