package lasagna

// TODO: define the 'PreparationTime()' function
func PreparationTime(sliceOfLayers []string, timePerLayer int) int {
    if timePerLayer == 0 {
        return len(sliceOfLayers) * 2
    }
    return len(sliceOfLayers) * timePerLayer
}

// TODO: define the 'Quantities()' function
func Quantities(sliceOfLayers []string) (noodles int, sauce float64) {
    for _, ingredient := range sliceOfLayers {
        if ingredient == "noodles" {
            noodles += 50
        }
        if ingredient == "sauce" {
            sauce += 0.2
        }
    }
    return
}

// TODO: define the 'AddSecretIngredient()' function
func AddSecretIngredient(friendLists, ownList []string) {
    ownList = append(ownList[:len(ownList) - 1], friendLists[len(friendLists) - 1])
}

// TODO: define the 'ScaleRecipe()' function
func ScaleRecipe(amounts []float64, portions int) []float64 {
    newRecipeAmounts := make([]float64, len(amounts))
    for i, amount := range amounts {
		newRecipeAmounts[i] = (amount / 2) * float64(portions)
    }
    return newRecipeAmounts
}

// Your first steps could be to read through the tasks, and create
// these functions with their correct parameter lists and return types.
// The function body only needs to contain `panic("")`.
//
// This will make the tests compile, but they will fail.
// You can then implement the function logic one by one and see
// an increasing number of tests passing as you implement more
// functionality.
