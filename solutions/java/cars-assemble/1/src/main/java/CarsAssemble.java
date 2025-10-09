public class CarsAssemble {

    public static final int CARS = 221;
    public static final double GOOD_RATE = 0.9;
    public static final double AVERAGE_RATE = 0.8;
    public static final double WORST_RATE = 0.77;
    
    public double productionRatePerHour(int speed) {
        if (speed == 0) {
            return 0;
        }
        
        int rate = CARS * speed;    
        if (speed <= 4) {
            return rate;
        } else if (speed <= 8) {
            return rate * GOOD_RATE;
        } else if (speed == 9) {
            return rate * AVERAGE_RATE;
        }
        return rate * WORST_RATE;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
    
}
