package speed

// TODO: define the 'Car' type struct
type Car struct {
    battery int
    batteryDrain int
    speed int
    distance int
}

// NewCar creates a new remote controlled car with full battery and given specifications.
func NewCar(speed int, batteryDrain int) Car {
	return Car {
        battery: 100,
        batteryDrain: batteryDrain,
        speed: speed,
    }
}

// TODO: define the 'Track' type struct
type Track struct {
    distance int
}

// NewTrack creates a new track
func NewTrack(distance int) Track {
	return Track {
        distance: distance,
    }
}

// Drive drives the car one time. If there is not enough battery to drive one more time,
// the car will not move.
func Drive(car Car) Car {
    if car.battery - car.batteryDrain >= 0 {
    	return Car {
            battery: car.battery - car.batteryDrain,
            batteryDrain: car.batteryDrain,
            speed: car.speed,
            distance: car.speed + car.distance,
        }
    }
    return Car {
        battery: car.battery,
        batteryDrain: car.batteryDrain,
        speed: car.speed,
        distance: car.distance,
    }
}

// CanFinish checks if a car is able to finish a certain track.
func CanFinish(car Car, track Track) bool {
	return car.battery - car.batteryDrain > 0 && (car.battery / car.batteryDrain) * car.speed + car.distance >= track.distance
}
