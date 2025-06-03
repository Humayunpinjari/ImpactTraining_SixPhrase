// Base class
class Vehicles {
    void startEngine() {
        System.out.println("Starting the engine of a generic vehicle.");
    }

    void stopEngine() {
        System.out.println("Stopping the engine of a generic vehicle.");
    }
}

// Subclass: Car
class Car extends Vehicles {
    @Override
    void startEngine() {
        System.out.println("Starting the car engine with a key.");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the car engine with the ignition off.");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicles {
    @Override
    void startEngine() {
        System.out.println("Starting the motorcycle engine with a kick-start.");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the motorcycle engine by turning the kill switch.");
    }
}

// Main class
public class VehiclesDeeemo {
    public static void main(String[] args) {
        Vehicles myVehicle;

        myVehicle = new Car(); // Polymorphism
        myVehicle.startEngine();
        myVehicle.stopEngine();

        System.out.println();

        myVehicle = new Motorcycle(); // Polymorphism
        myVehicle.startEngine();
        myVehicle.stopEngine();
    }
}
