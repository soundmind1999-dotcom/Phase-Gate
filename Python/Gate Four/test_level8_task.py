from unittest import TestCase


class TestFunctions(TestCase):

    def test_get_primes(self):
        self.assertEqual(get_primes([5, 9, 3, 6, 2]), [5, 3, 2])
        self.assertEqual(get_primes([1, 4, 6]), [])

    def test_replace_negatives(self):
        self.assertEqual(replace_negatives([1, -2, 3, -4]), [1, 0, 3, 0])
        self.assertEqual(replace_negatives([-1, -2]), [0, 0])

    def test_move_zeros(self):
        self.assertEqual(move_zeros([1, 0, 2, 0, 3]), [1, 2, 3, 0, 0])
        self.assertEqual(move_zeros([0, 0, 1]), [1, 0, 0])

    def test_find_duplicates(self):
        self.assertEqual(find_duplicates([1, 2, 3, 2, 4, 1]), [2, 1])
        self.assertEqual(find_duplicates([1, 2, 3]), [])


