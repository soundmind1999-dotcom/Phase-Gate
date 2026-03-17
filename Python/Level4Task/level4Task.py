def add_two_numbers(first_number, second_number):
    return first_number + second_number


def check_even_number(number):
    return number % 2 == 0


def square_of_a_number(number):
    return number * number



def temperature_converter(celsius):

    fahrenheit = (celsius * 9/5) + 32

    return int(fahrenheit)


def largest_of_three_numbers(first_number, second_number, third_number):

    largest_number = first_number

    if second_number > largest:
        largest = second_number

    if third_number > largest: 
        largest = third_number

    return largest




def simple_interest(principal, rate, time):

    principal = float(input("Enter principal amount"))
    time = float(input("Enter number of years"))
    rate = int(input("Enter rate"))
    
    return (principal * rate * time) / 100


def number_is_prime(number):

    factors = 0
    counter = 2
    while(counter < number):
        if number % counter == 0:
            factors +=1
        counter+=1
    if factors == 0:
        return True
    return False




def multiplication_table(number):

    for counter in range (1, 11):

        return f"{number} x {counter} = {number * counter}"


def area_of_rectangle(length, width):
    return length * width











