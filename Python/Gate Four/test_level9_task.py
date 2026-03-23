from unittest import TestCase

class TestFunctions(TestCase):

    def test_split_even_odd(self):
        self.assertEqual(split_even_odd([1, 2, 3, 4]), [[1, 3], [2, 4]])
        self.assertEqual(split_even_odd([2, 4, 6]), [[], [2, 4, 6]])

    def test_perfect_squares(self):
        self.assertEqual(perfect_squares([1, 2, 3, 4, 5, 9]), [1, 4, 9])
        self.assertEqual(perfect_squares([2, 3, 5]), [])

    def test_is_palindrome(self):
        self.assertTrue(is_palindrome([1, 2, 3, 2, 1]))
        self.assertFalse(is_palindrome([1, 2, 3]))

    def test_replace_non_squares(self):
        self.assertEqual(replace_non_squares([1, 2, 3, 4]), [1, -1, -1, 4])
        self.assertEqual(replace_non_squares([2, 3, 5]), [-1, -1, -1])
