public class FuelVehicle extends RentedVehicle {
    private double mileageFees;
    private double nbKms;

    public FuelVehicle(double baseFee, double nbKms) {
        super(baseFee);
        this.nbKms = nbKms;
        calculateMileageFees();
    }

    private void calculateMileageFees() {
        if (nbKms < 100) {
            mileageFees = 0.2 * nbKms;
        } else if (nbKms >= 100 && nbKms <= 400) {
            mileageFees = 0.3 * nbKms;
        } else {
            mileageFees = 0.3 * 400 + 0.5 * (nbKms - 400);
        }
    }

    public double getMileageFees() {
        return mileageFees;
    }

    public double getNbKms() {
        return nbKms;
    }

    public void setNbKms(double nbKms) {
        this.nbKms = nbKms;
        calculateMileageFees();
    }

    @Override
    public double getCost() {
        return super.getBaseFee() + mileageFees;
    }
}
