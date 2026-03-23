from unittest import TestCase

class TestMilkyDoughnut(TestCase):

    def test_count_even_numbers(self):
        self.assertEqual(count_even_numbers([1, 2, 3, 4, 6]), 3)
        self.assertEqual(count_even_numbers([1, 3, 5]), 0)

    def test_linear_search(self):
        self.assertEqual(linear_search([1, 2, 3, 4], 3), 2)
        self.assertEqual(linear_search([1, 2, 3, 4], 5), -1)

    def test_generate_squares(self):
        self.assertEqual(generate_squares(5), [1, 4, 9, 16, 25])
        self.assertEqual(generate_squares(0), [])

    def test_are_arrays_equal(self):
        self.assertTrue(are_arrays_equal([1, 2, 3], [1, 2, 3]))
        self.assertFalse(are_arrays_equal([1, 2, 3], [3, 2, 1]))
        self.assertFalse(are_arrays_equal([1, 2], [1, 2, 3]))


