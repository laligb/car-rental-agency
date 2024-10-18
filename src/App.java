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
 *
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
   public String make() {
    return "";
   }

   public String model() {
    return "";
   }

   public int year() {
    return 0;
   }

   public int numberOfDoors() {
      return 0;
   }

   public String fuelType() {
        return "";
   }

  public void setNumberOfDoors(int doors) {};
  public void setFuelType(String fuel) {};
}

/**
 *
 */
class Motorcycle implements Vehicle, MotorVehicle {
  public String make() {
   return "";
  }

  public String model() {
   return "";
  }

  public int year() {
   return 0;
  }

  public int numberOfWheels() {
     return 0;
  }

  public String motorcycleType() {
       return "";
  }

  public void setNumberOfWheels(int number) {};
  public void setMotorcycleType(String type) {};

}

/**
 *
 */
class Truck implements Vehicle, TruckVehicle {
  public String make() {
   return "";
  }

  public String model() {
   return "";
  }

  public int year() {
   return 0;
  }

  public float cargoCapacity() {
     return 0.0f;
  }

  public String transmittionType() {
       return "";
  }

  public void setCartoCapacity(float capacity) {};
  public void setTransmittionType(String type) {};
}
