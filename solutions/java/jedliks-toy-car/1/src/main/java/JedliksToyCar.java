public class JedliksToyCar {

    public static int DRIVEN_METERS = 20;
    public static int BATTERY_SPEND = 1;
    
    private int distance = 0;
    private int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + String.valueOf(distance) + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0) {
             return "Battery empty";
        }
        return "Battery at " + String.valueOf(batteryPercentage) + "%";
    }

    public void drive() {
        if (batteryPercentage > 0) {   
            distance += DRIVEN_METERS;
            batteryPercentage -= BATTERY_SPEND;
        }
    }
    
}
