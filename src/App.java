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

interface CarVehicle {
  int numberOfDoors();
  String fuelType(); // petrol, diesel, or electric
}

/**
 * MotorVehicle
 */
interface MotorVehicle {
  int numberOfWheels();
  String motorcycleType(); // sport, cruiser, or off-road
}

/**
 * TruckVehicle
 */
interface TruckVehicle {
  float cargoCapacity(); // in tons
  String transmittionType(); // manual or automatic

}

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
}

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
}

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
}
