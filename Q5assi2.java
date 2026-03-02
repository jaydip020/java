// Parent Class
class Vehicle {
    String vehicleName;
    double rentPerDay;

    void showVehicle() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Rent Per Day: " + rentPerDay);
    }
}

// Child Class 1
class Car extends Vehicle {
    int days;
    double totalRent;

    void showCar() {
        totalRent = rentPerDay * days;

        if (days >= 7) {
            double discount = totalRent * 0.15;
            totalRent = totalRent - discount;
            System.out.println("15% Discount Applied: " + discount);
        }

        showVehicle();
        System.out.println("Days: " + days);
        System.out.println("Total Rent: " + totalRent);
    }
}

// Child Class 2
class Bike extends Vehicle {
    int days;
    double totalRent;

    void showBike() {
        totalRent = rentPerDay * days;

        if (days >= 5) {
            double discount = totalRent * 0.10;
            totalRent = totalRent - discount;
            System.out.println("10% Discount Applied: " + discount);
        }

        showVehicle();
        System.out.println("Days: " + days);
        System.out.println("Total Rent: " + totalRent);
    }
}

// Main Class
public class VehicleRentalSystem {
    public static void main(String[] args) {

        // Car Object
        Car car = new Car();
        car.vehicleName = "Toyota";
        car.rentPerDay = 2000;
        car.days = 8;

        System.out.println("----- Car Rental -----");
        car.showCar();

        System.out.println();

        // Bike Object
        Bike bike = new Bike();
        bike.vehicleName = "Honda";
        bike.rentPerDay = 500;
        bike.days = 6;

        System.out.println("----- Bike Rental -----");
        bike.showBike();
    }
}
