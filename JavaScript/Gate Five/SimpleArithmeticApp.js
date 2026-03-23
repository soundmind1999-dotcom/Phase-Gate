//set count = 1
//set number of correct answers = 0
//while count <= 10
//generate first number randomly between 1 and 100
//generate second number randomly between 1 and 100
//
//while second number is less than firstNumber 
//generate second number again between 1 and 100
//    
//
//set correct answer equals first number minus second number
//
//display first number minus second number
//
//prompt user to enter answer
//
//while answer is not equal to correct answer
//display the question again
//prompt user to answer again
//increment count by 1
//increment the number of attempts by 1
//display you scored number of correct answer out of 10



const prompt = require('prompt_sync')();

let count = 1;
let numberOfcorrectAnswers = 0;

while(count <= 10){
 
    let firstNumber = Math.floor(Math.random() * (100 - 0 + 1)) + 0);

    let secondNumber = Math.floor(Math.random() * (100 - 0 + 1)) + 0);


    while (secondNumber > firstNumber){
        secondNumber = Math.floor(Math.random() * (100 - 0 + 1)) + 0);

    let answer = Number(prompt("%d - %d = ", firstNumber, secondNumber));

    if ((firstNumber - secondNumber) != answer){

        answer = Number(prompt("%d - %d = ", firstNumber, secondNumber));
}
   if ((first_number - second_number) == answer){
        numberOfCorrectAnswers += 1;

}
}

    count++;

console.log("You scored %d% out of 10%n", numberOfCorrectAnswers);










}
