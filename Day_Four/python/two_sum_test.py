from unittest import TestCase

import two_sum

class TestTwoSum(TestCase):

    def test_that_funtion_returns_the_two_number_thatMakes_up_its_sum(self):

        array = [8, 6, 12, 4, -2]
        number = 6
        actual = two_sum.get_two_Sum(array, number)
        expected = [8, -2]
        self.assertEqual(actual, expected)


class TestDuplicateElimination(TestCase):
    def     test_that_function_removes_dupliate_in_list_and_returns_the_modified_list(self):

        array = [9, 5, 1, 9, 4, 5, 1, 7]
        actual = two_sum.duplicate_elimination(array)
        expected = [9, 5, 1, 4, 7]
        self.assertEqual(actual, expected)
