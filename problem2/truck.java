public class Truck extends FuelVehicle {
    private double capacity;

    public Truck(double baseFee, double nbKms, double capacity) {
        super(baseFee, nbKms);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public double getCost() {
        return super.getCost() + capacity * super.getBaseFee();
    }
}
