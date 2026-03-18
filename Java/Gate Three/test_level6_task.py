from unittest import TestCase  

def numbering_character(character):

    output = ""
    count = 1
    
    for letter in range(1, len(character)):
        if character[letter] == character[letter-1]:
            count += 1
        else:
            output += f"{character[letter-1]}{count}"
            count = 1
     output += f"{character[-1]}{count}"
    return output

class TestNumberingCharacter(TestCase):

    def test_numbering_character_for_different_cases(self):
        self.assertEqual(numbering_character("a"), "a1")  
        self.assertEqual(numbering_character("aa"), "a2")  
        self.assertEqual(numbering_character("aabccc"), "a2b1c3") 
        self.assertEqual(numbering_character("abcd"), "a1b1c1d1") 
        

