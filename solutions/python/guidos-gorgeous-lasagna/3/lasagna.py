EXPECTED_BAKE_TIME = 40
TIME_COOKING_A_LAYER = 2

def bake_time_remaining(actual_minutes_in_oven):
    """
    """
    return EXPECTED_BAKE_TIME - actual_minutes_in_oven

def preparation_time_in_minutes(number_of_layers):
    """
    """
    return TIME_COOKING_A_LAYER * number_of_layers

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes) preparing and cooking.

    This function takes two integers representing the number of lasagna layers and the
    time already spent baking and calculates the total elapsed minutes spent cooking the
    lasagna.
    """
    return elapsed_bake_time + preparation_time_in_minutes(number_of_layers)
