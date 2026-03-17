const prompt = require("prompt-sync")();

let number = parseInt(prompt("Enter a number: ")):

let factorial = 1
let result = 0

for(let count = 1; count < number; count++){

    result = factorial * count;

console.log(result);
    }
