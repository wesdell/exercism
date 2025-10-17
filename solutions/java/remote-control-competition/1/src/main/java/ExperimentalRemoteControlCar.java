public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private final int DRIVE_UNITS = 20;

    private int distanceTravelled = 0;

    public void drive() {
        this.distanceTravelled += DRIVE_UNITS;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

}
