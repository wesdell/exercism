package birdwatcher

// TotalBirdCount return the total bird count by summing
// the individual day's counts.
func TotalBirdCount(birdsPerDay []int) int {
	total := 0
    for i := 0; i < len(birdsPerDay); i += 1 {
        total += birdsPerDay[i]
    }
    return total
}

// BirdsInWeek returns the total bird count by summing
// only the items belonging to the given week.
func BirdsInWeek(birdsPerDay []int, week int) int {
	return TotalBirdCount(birdsPerDay[(week - 1) * 7: week * 7])
}

// FixBirdCountLog returns the bird counts after correcting
// the bird counts for alternate days.
func FixBirdCountLog(birdsPerDay []int) []int {
    for i := 0; i < len(birdsPerDay); i += 1 {
        if i % 2 != 0 {
            birdsPerDay[i] = birdsPerDay[i]
        } else {
            birdsPerDay[i] = birdsPerDay[i] + 1
        }
    }
    return birdsPerDay
}
