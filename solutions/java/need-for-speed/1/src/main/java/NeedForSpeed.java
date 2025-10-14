class NeedForSpeed {

    private int distanceDriven = 0;
    private int battery = 100;
    private int speed;
    private int batteryDrain;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (this.battery - this.batteryDrain) < 0;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (battery > 0) {
            this.distanceDriven += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getBattery() {
        return this.battery;
    }
    
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return (car.getBattery() / car.getBatteryDrain()) * car.getSpeed() >= this.distance;
    }
    
}
