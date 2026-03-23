def count_even_numbers(numbers):
    even_count = 0

    for number in numbers:
        if number % 2 == 0:
            even_count += 1

    return even_count


def linear_search(numbers, target_value):
    for index in range(len(numbers)):
        if numbers[index] == target_value:
            return index
    return -1


def generate_squares(size):
    squares = []

    for index in range(size):
        number = index + 1
        squares.append(number * number)

    return squares


def are_arrays_equal(first_array, second_array):
    if len(first_array) != len(second_array):
        return False

    for index in range(len(first_array)):
        if first_array[index] != second_array[index]:
            return False

    return True



