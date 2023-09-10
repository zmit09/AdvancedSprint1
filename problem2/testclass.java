import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        RentedVehicle[] vehicles = new RentedVehicle[6];

        for (int i = 0; i < 6; i++) {
            int randomType = new Random().nextInt(3) + 1;
            double baseFee = 50 + Math.random() * 100; // Random base fee
            double nbKms = 50 + Math.random() * 500; // Random number of kilometers

            if (randomType == 1) {
                int nbSeats = new Random().nextInt(4) + 2; // Random number of seats (2 to 5)
                vehicles[i] = new Car(baseFee, nbKms, nbSeats);
            } else if (randomType == 2) {
                double capacity = 2 + Math.random() * 10; // Random capacity (2 to 12 tons)
                vehicles[i] = new Truck(baseFee, nbKms, capacity);
            } else {
                int nbDays = new Random().nextInt(5) + 1; // Random number of rental days (1 to 5)
                vehicles[i] = new Bicycle(baseFee, nbDays);
            }
        }

        printVehicleDetails(vehicles);
    }

    public static void printVehicleDetails(RentedVehicle[] vehicles) {
        for (RentedVehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                System.out.println("Car - Seats: " + ((Car) vehicle).getNbSeats() +
                        ", Cost: $" + vehicle.getCost());
            } else if (vehicle instanceof Truck) {
                System.out.println("Truck - Capacity: " + ((Truck) vehicle).getCapacity() +
                        " tons, Cost: $" + vehicle.getCost());
            } else if (vehicle instanceof Bicycle) {
                System.out.println("Bicycle - Rental Days: " + ((Bicycle) vehicle).getNbDays() +
                        ", Cost: $" + vehicle.getCost());
            }
        }
    }
}
