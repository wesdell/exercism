
class BirdWatcher {

    private static final int BUSY_DAYS = 5;
    
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int size = numberOfDays > birdsPerDay.length ? birdsPerDay.length : numberOfDays;
        for (int i = 0; i < size; i += 1) {
            total += birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int total = 0;
        for (int birds : birdsPerDay) {
            if (birds >= BUSY_DAYS) {
                total += 1;
            }
        }
        return total;
    }
    
}
