public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
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
}


/**
 *
 */
class Car extends AbstractVehicle implements CarVehicle  {

  private int varNumber;
  private String varType;

   Car (
    String varMake,
    String varModel,
    int varYear,
    int varNumber,
    String varType
        ) {
    super(varMake, varModel, varYear);
    this.varNumber = varNumber;
    this.varType = varType;
   }

   public int numberOfDoors() {
      return varNumber;
   }

   public String fuelType() {
        return varType;
   }

  public void setNumberOfDoors(int doors) {};
  public void setFuelType(String fuel) {};
}

/**
 *
 */
class Motorcycle extends AbstractVehicle implements MotorVehicle {

  private int varNumber;
  private String varType;

  Motorcycle (
    String varMake,
    String varModel,
    int varYear,
    int varNumber,
    String varType
        ) {
    super(varMake, varModel, varYear);
    this.varNumber = varNumber;
    this.varType = varType;
   }

  public int numberOfWheels() {
     return varNumber;
  }

  public String motorcycleType() {
       return varType;
  }

  public void setNumberOfWheels(int number) {};
  public void setMotorcycleType(String type) {};

}

/**
 *
 */
class Truck extends AbstractVehicle implements TruckVehicle {

  private int varCapacity;
  private String varType;

  Truck (
    String varMake,
    String varModel,
    int varYear,
    int varCapacity,
    String varType
        ) {
    super(varMake, varModel, varYear);
    this.varCapacity = varCapacity;
    this.varType = varType;
   }

  public float cargoCapacity() {
     return varCapacity;
  }

  public String transmittionType() {
       return varType;
  }

  public void setCartoCapacity(float capacity) {};
  public void setTransmittionType(String type) {};
}
