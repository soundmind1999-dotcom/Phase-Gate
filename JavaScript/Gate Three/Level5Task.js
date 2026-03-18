function completeArray(input, length) {

    const output = [];
   
    for (let count = 0; count < length; count++) {
        output[count] = -1;
 }

    for (let count = 0; count < input.length && count < length; count++) {
        output[count] = input[count];
 }

    return output;
}
console.log(completeArray([10, 11, 12], 5));          
console.log(completeArray([10, 11, 12, 13, 14], 2));   
console.log(completeArray([], 4));                     
