from unittest import TestCase

def find_largest_index_position(store):
    largest_value = store[0][0]
    row_index = 0
    col_index = 0

    for count in range(len(store)):           
        for counter in range(len(store[count])):   
            if store[count][counter] > largest_value: 
                largest_value = store[count][counter]
                row_index = count
                col_index = counter

    return (row_index, col_index)


class TestFindLargestIndexPosition(TestCase):

    def test_largest_at_random(self):
        store = [[45.2, 90.28, 77.1], [3.52, 9.86, 11.77], [7.7, 10, 22.33, 12]]
        self.assertEqual(find_largest_index_position(store), (0, 1))

    def test_largest_at_last_row_and_last_col(self):
        store = [[1, 2, 3], [4, 5, 6], [7, 8, 99] ]
        self.assertEqual(find_largest_index_position(store), (2, 2))

    def test_largest_at_first_row_and_first_col(self):
        store = [[100, 50],[20, 30]]
        self.assertEqual(find_largest_index_position(store), (0, 0))


