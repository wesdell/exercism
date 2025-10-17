import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> sortedCars = new ArrayList<>();
        List<ProductionRemoteControlCar> clonedCars = new ArrayList<>(cars);

        while (!clonedCars.isEmpty()) {
        int greaterRankingIdx = 0;
        for (int i = 1; i < clonedCars.size(); i += 1) {
            if (clonedCars.get(i).getNumberOfVictories() > clonedCars.get(greaterRankingIdx).getNumberOfVictories()) {
                greaterRankingIdx = i;
            }
        }
        sortedCars.add(clonedCars.get(greaterRankingIdx));
        clonedCars.remove(greaterRankingIdx);
    }
    return sortedCars;
    }

}
