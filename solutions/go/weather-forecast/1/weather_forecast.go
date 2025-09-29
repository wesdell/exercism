// Package weather forecast the current weather condition
// of various cities in Goblinocous.
package weather

// CurrentCondition represents actual cities weather condition.
var CurrentCondition string
// CurrentLocation represents actual city location.
var CurrentLocation string

// Forecast returns a string describing current weather condition and location of a particular city.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
