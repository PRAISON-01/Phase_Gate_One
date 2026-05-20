#Test

from unittest import TestCase

import like_system 

class TestPostLikes(TestCase):
    
    def test_that_empty_list_returns_no_one_likes(self):
        
        array = []
        actual = like_system.collect_names(array)
        expected = "no one likes this"
        self.assertEqual(expected, actual)


    def test_that_names_lis_is_one_returns_names(self):
        
        array = ["Praise"]
        actual = like_system.collect_names(array)
        expected = "Praise likes this"
        self.assertEqual(expected, actual)

    def test_that_names_list_is_two_returns_names(self):
        
        array = ["Praise","Eob"]
        actual = like_system.collect_names(array)
        expected = "Praise and Eob likes this"
        self.assertEqual(expected, actual)

    def test_that_names_list_is_three_returns_names_and_comment(self):
        
        array = ["Praise","Eob","biscuit"]
        actual = like_system.collect_names(array)
        expected = "Praise, Eob and biscuit likes this"
        self.assertEqual(expected, actual)




