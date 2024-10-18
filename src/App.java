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
 * Vehicle
 */
interface Vehicle {
  String make();
  String model();
  int year();
}

/**
 * CarVehicle
 */
interface CarVehicle {
  int numberOfDoors();
  String fuelType(); // petrol, diesel, or electric
  void setNumberOfDoors(int doors); // Setter of Door's number
  void setFuelType(String fuel); // Setter of fuel type
}

/**
 * MotorVehicle
 */
interface MotorVehicle {
  int numberOfWheels();
  String motorcycleType(); // sport, cruiser, or off-road
  void setNumberOfWheels(int number); // setter for wheel's number
  void setMotorcycleType(String type); //setter of motorcycle type
}

/**
 * TruckVehicle
 */
interface TruckVehicle {
  float cargoCapacity(); // in tons
  String transmittionType(); // manual or automatic
  void setCartoCapacity(float capacity); // setter
  void setTransmittionType(String type); // setter
}

/**
 *
 */
abstract class AbstractVehicle implements Vehicle  {
    protected String make;
    protected String model;
    protected int year;

    public AbstractVehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String make() {
      return make;
    }

    public String model() {
      return model;
    }

    public int year() {
      return year;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}


/**
 *
 */
class Car extends AbstractVehicle implements CarVehicle  {

  private int numberOfDoors;
  private String fuel;


   Car (
    String make,
    String model,
    int year,
    int numberOfDoors,
    String fuel
        ) {
    super(make, model, year);
    this.numberOfDoors = numberOfDoors;
    this.fuel = fuel;
   }

   public int numberOfDoors() {
      return numberOfDoors;
   }

   public String fuelType() {
        return fuel;
   }

  public void setNumberOfDoors(int number) {
    this.numberOfDoors = number;
  };

  public void setFuelType(String fuel) {
    if (fuel.equals("petrol")
    || fuel.equals("diesel")
    || fuel.equals("electric")) {
      this.fuel = fuel;
    } else {
      System.err.println("Incorrect type of fuel");
    }
  };

  @Override
  public String toString() {
      return "Vehicle: Car, " + super.toString() + ", Number of Doors: " + numberOfDoors + ", Fuel Type: " + fuel;
  }
}

/**
 *
 */
class Motorcycle extends AbstractVehicle implements MotorVehicle {

  private int numberOfWheels;
  private String motorType;

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

  public int numberOfWheels() {
     return numberOfWheels;
  }

  public String motorcycleType() {
       return motorType;
  }

  public void setNumberOfWheels(int number) {
    this.numberOfWheels = number;
  };

  public void setMotorcycleType(String type) {
    if (type.equals("sport")
    || type.equals("cruiser")
    || type.equals("off-road")) {
      this.motorType = type;
    } else {
      System.err.println("Incorrect type of motorcycle");
    }
  };

  @Override
  public String toString() {
      return "Vehicle: Motorcycle, " + super.toString() + ", Number of Wheels: " + numberOfWheels + ", Motorcycle Type: " + motorType;
  }

}

/**
 *
 */
class Truck extends AbstractVehicle implements TruckVehicle {

  private float cargoCapacity;
  private String transmittionsType;

  Truck (
    String make,
    String model,
    int year,
    float cargoCapacity,
    String transmittionsType
        ) {
    super(make, model, year);
    this.cargoCapacity = cargoCapacity;
    this.transmittionsType = transmittionsType;
   }

  public float cargoCapacity() {
     return cargoCapacity;
  }

  public String transmittionType() {
       return transmittionsType;
  }

  public void setCartoCapacity(float capacity) {
    this.cargoCapacity = capacity;
  };

  public void setTransmittionType(String type) {
    if (type.equals("manual") || type.equals("automatic")) {
      this.transmittionsType = type;
    } else {
      System.err.println("Incorrect type of transmittion");
    }
  };

  @Override
  public String toString() {
      return "Vehicle: Truck, " + super.toString() + ", Capacity: " + cargoCapacity + " tons, Transmittion Type: " + transmittionsType;
  }
}
