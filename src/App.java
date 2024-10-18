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


/**
 *
 */
class Car implements Vehicle, CarVehicle {

   private String varMake;
   private String varModel;
   private int varYear;
   private int varNumber;
   private String varType;

   Car (
    String varMake,
    String varModel,
    int varYear,
    int varNumber,
    String varType
        ) {
    this.varMake = varMake;
    this.varModel = varModel;
    this.varNumber = varNumber;
    this.varYear = varYear;
    this.varType = varType;
   }
   public String make() {
    return varMake;
   }

   public String model() {
    return varModel;
   }

   public int year() {
    return varYear;
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
class Motorcycle implements Vehicle, MotorVehicle {

  private String varMake;
  private String varModel;
  private int varYear;
  private int varNumber;
  private String varType;

  Motorcycle (
    String varMake,
    String varModel,
    int varYear,
    int varNumber,
    String varType
        ) {
    this.varMake = varMake;
    this.varModel = varModel;
    this.varNumber = varNumber;
    this.varYear = varYear;
    this.varType = varType;
   }

   public String make() {
    return varMake;
   }

   public String model() {
    return varModel;
   }

   public int year() {
    return varYear;
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
class Truck implements Vehicle, TruckVehicle {

  private String varMake;
  private String varModel;
  private int varYear;
  private int varCapacity;
  private String varType;

  Truck (
    String varMake,
    String varModel,
    int varYear,
    int varCapacity,
    String varType
        ) {
    this.varMake = varMake;
    this.varModel = varModel;
    this.varCapacity = varCapacity;
    this.varYear = varYear;
    this.varType = varType;
   }


   public String make() {
    return varMake;
   }

   public String model() {
    return varModel;
   }

   public int year() {
    return varYear;
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
