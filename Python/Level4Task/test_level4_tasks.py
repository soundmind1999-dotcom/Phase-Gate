
from unittest import TestCase
class level4Task(TestCase)
    def test_add_two_numbers(self):
    result_one = check_add_two_numbers.check_for_positive_first_number_and_positive_second_number(2, 5)
    self.assertEqual(result_one, 7)
    result_two = check_even_number.check_for_negative_first_number_and_negative_second_number(-5, -3)
    self.assertEqual(result_two, -8)


    def test_check_even_number(self):
    result_one = check_even_number.check_if_this_number_is_an_even_number(2)
    self.assertEqual(result_one, True)
    result_two = check_even_number.check_if_this_number_is_an_even_number(5)
    self.assertEqual(result_two, False)



    def test_square_of_a_number(self):
    result_one = square_of_number.check_for_square_of_postive_number(2)
    self.assertEqual(result_one, 4)
    result_two = square_of_number.check_for_square_of_negative_number(-5)
    self.assertEqual(result_two, 25)


    def test_temeperature_converter(self):
    result_one = temperature_converter.check_for_a_low_temperature(-5)
    self.assertEqual(result_one, 21)
    result_two = temperature_converter.check_for_a high_temperature(55)
    self.assertEqual(result_two, 131)


    def test_largest_of_three_numbers(self):
    result_one = largest_of_three_numbers.check_for_the_largest_of_all_three_negative_numbers(-2, -5, -7)
    self.assertEqual(result_one, -2)
    result_two = largest_of_three_numbers.check_for_the_largest_of_all_three_positive_numbers(2, 5, 7)
    self.assertEqual(result_two, 7)


    def test_area_of_a_rectangle(self):
    result_one = area_of_a_rectangle.check_for_a_negative_length_and_width(-5, -6)
    self.assertEqual(result_one, 30)
    result_two = area_of_a_rectangle.check_for_a_positive_length_and_width(5, 6)
    self.assertEqual(result_two, 30)




   
