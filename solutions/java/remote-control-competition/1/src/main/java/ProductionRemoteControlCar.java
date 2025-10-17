class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private final int DRIVE_UNITS = 10;

    private int distanceTravelled = 0;
    private int numberOfVictories = 0;

    public void drive() {
        this.distanceTravelled += DRIVE_UNITS;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories += numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return car.getNumberOfVictories() - this.numberOfVictories;
    }

}
