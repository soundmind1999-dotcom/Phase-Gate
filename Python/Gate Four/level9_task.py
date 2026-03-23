def split_even_odd(numbers):
    even_numbers = []
    odd_numbers = []

    for number in numbers:
        if number % 2 == 0:
            even_numbers.append(number)
        else:
            odd_numbers.append(number)

    return [odd_numbers, even_numbers]


def perfect_squares(numbers):
    squares = []

    for number in numbers:
        for value in range(number + 1):
            if value * value == number:
                squares.append(number)

    return squares



def is_palindrome(numbers):
    for index in range(len(numbers) // 2):
        if numbers[index] != numbers[len(numbers) - 1 - index]:
            return False
    return True


def replace_non_squares(numbers):
    for index in range(len(numbers)):
        is_square = False

        for value in range(numbers[index] + 1):
            if value * value == numbers[index]:  
                is_square = True

        if not is_square:
            numbers[index] = -1

    return numbers
