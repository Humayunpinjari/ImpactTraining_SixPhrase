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
        System.out.println("Starting the car engine with a push button.");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the car engine by turning off the ignition.");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicles {
    @Override
    void startEngine() {
        System.out.println("Starting the motorcycle engine with a kick.");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the motorcycle engine with a kill switch.");
    }
}

// Main class
public class TestDrive {
    public static void main(String[] args) {
        Vehicles vehicle;

        // Car object through base class reference
        vehicle = new Car();
        vehicle.startEngine();
        vehicle.stopEngine();

        System.out.println();

        // Motorcycle object through base class reference
        vehicle = new Motorcycle();
        vehicle.startEngine();
        vehicle.stopEngine();
    }
}
