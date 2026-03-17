const prompt = require("prompt-sync")();

let number = parseInt(prompt("Enter a number: ")):

let total = 0 


for(let count = 1; count < number + 1; count++){

    total = count + count

    result = '$(count) + $(count) = $(total)'

console.log(result);
    }
