def numbering_character()











def numbering_character()


































def numbering_character(character):
   
    output = ""
    count = 1
    
    for letter in range(1, len(character)):
        if character[letter] == character[letter - 1]:
            count += 1
        else:
            output += f"{character[letter - 1]}{count}"
            count = 1

    output += f"{character[-1]}{count}"  
    return output
























































































































# Examples
print('"'+compress_string("AaaBBc")+'"')      # "A1a2B2c1"
print('"'+compress_string("EEEEnnneee")+'"')  # "E4n4e3"
print('"'+compress_string("oooooYOO")+'"')    # "o6Y1O2"






















































































def compress_string(s):
    if not s:
        return ""
    
    result = []
    count = 1
    
    for i in range(1, len(s)):
        if s[i] == s[i-1]:
            count += 1
        else:
            result.append(f"{s[i-1]}{count}")
            count = 1
    result.append(f"{s[-1]}{count}")  # last character
    return "".join(result)

# Examples
print(compress_string("AaaBBc"))      # A1a2B2c1
print(compress_string("EEEEnnneee"))  # E4n4e3
print(compress_string("oooooYOO"))    # o6Y1O2

















def compress_string(s):
    if not s:
        return ""
    
    result = []
    count = 1
    
    for i in range(1, len(s)):
        if s[i] == s[i-1]:
            count += 1
        else:
            result.append(f"{s[i-1]}{count}")
            count = 1
    
    # Add the last character
    result.append(f"{s[-1]}{count}")
    
    return "".join(result)

# Examples
print(compress_string("AaaBBc"))      # A1a2B2c1
print(compress_string("EEEEnnneee"))  # E4n2e3
print(compress_string("oooooYOO"))    # o5Y1O2
