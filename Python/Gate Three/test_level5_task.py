from unittest import TestCase

def complete_array(input_list, length):
    output = [-1] * length
    for number in range(min(len(input_list), length)):
        output[number] = input_list[number]
    return output

class TestCompleteArray(TestCase):
    def test_for_different_possibilities(self):
        self.assertEqual(complete_array([10, 11, 12], 5), [10, 11, 12, -1, -1])
        self.assertEqual(complete_array([10, 11, 12, 13, 14], 2), [10, 11])
        self.assertEqual(complete_array([], 4), [-1, -1, -1, -1])
        self.assertEqual(complete_array([1,2,3], 0), [])
        self.assertEqual(complete_array([], 0), [])
        self.assertEqual(complete_array([5], 3), [5, -1, -1])





