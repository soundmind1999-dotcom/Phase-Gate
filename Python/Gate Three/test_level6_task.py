from unittest import TestCase  

def numbering_character(character):
    if not character:
        return ""
    
    output = ""
    count = 1
    
    for letter in range(1, len(character)):
        if character[letter] == character[letter-1]:
            count += 1
        else:
            output += character[letter-1] + str(count)
            count = 1
    output += character[-1] + str(count)
    return output

class TestNumberingCharacter(TestCase):

    def test_numbering_character(self):
        self.assertEqual(numbering_character(""), "")  # Empty string
        self.assertEqual(numbering_character("a"), "a1")  # Single character
        self.assertEqual(numbering_character("aa"), "a2")  # Two same characters
        self.assertEqual(numbering_character("aabccc"), "a2b1c3")  # Mixed string
        self.assertEqual(numbering_character("abcd"), "a1b1c1d1")  # No consecutive duplicates
        self.assertEqual(numbering_character("wwwwaaadexxxxx"), "w4a3d1e1x5")  # Longer sequence


