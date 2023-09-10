public class Car extends FuelVehicle {
    private int nbSeats;

    public Car(double baseFee, double nbKms, int nbSeats) {
        super(baseFee, nbKms);
        this.nbSeats = nbSeats;
    }

    public int getNbSeats() {
        return nbSeats;
    }

    public void setNbSeats(int nbSeats) {
        this.nbSeats = nbSeats;
    }

    @Override
    public double getCost() {
        return super.getCost() + nbSeats * super.getBaseFee();
    }
}
