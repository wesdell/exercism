public class Lasagna {

    public static final int OVEN_TIME = 40;
    public static final int TIMER_PER_LAYER = 2;
    
    public int expectedMinutesInOven() {
        return OVEN_TIME;
    }
    
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }
    
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * TIMER_PER_LAYER;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }
    
}
