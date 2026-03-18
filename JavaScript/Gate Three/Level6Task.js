function numberingCharacter(character) {
    if (!character) 


    return "";

    let result = "";
    let count = 1;

    for (let letter = 1; letter < character.length; letter++) {
        if (character[letter] === character[letter - 1]) {
            count++;
  } else {
            result += character[letter - 1] + count;
            count = 1;
        } }

    result += character[character.length - 1] + count; 
     return "\"" + result + "\""; 
}

console.log(numberingCharacter("AaaBBc"));      
console.log(numberingCharacter("EEEEnnneee")); 
console.log(numberingCharacter("oooooYOO"));    
