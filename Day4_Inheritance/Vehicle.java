class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Car - Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType + ", Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Truck - Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType + ", Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasCarrier;

    Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        System.out.println("Motorcycle - Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType + ", Has Carrier: " + hasCarrier);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 10),
            new Motorcycle(150, "Petrol", true)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}