def get_primes(numbers):
    prime_numbers = []

    for number in numbers:
        if number > 1:
            is_prime = True

            for divisor in range(2, number):
                if number % divisor == 0:
                    is_prime = False

            if is_prime:
                prime_numbers.append(number)

    return prime_numbers



def replace_negatives(numbers):
    for index in range(len(numbers)):
        if numbers[index] < 0:
            numbers[index] = 0
    return numbers



def move_zeros(numbers):
    result = []

    for number in numbers:
        if number != 0:
            result.append(number)

    for number in numbers:
        if number == 0:
            result.append(0)

    return result


def find_duplicates(numbers):
    duplicates = []

    for index in range(len(numbers)):
        for next_index in range(index + 1, len(numbers)):
            if numbers[index] == numbers[next_index] and numbers[index] not in duplicates:
                duplicates.append(numbers[index])

    return duplicates
