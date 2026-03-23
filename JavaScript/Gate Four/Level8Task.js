
function getPrimes(numbers) {
    let temp = new Array(numbers.length);
    let count = 0;

    for (let counter = 0; counter < numbers.length; counter++) {
        let number = numbers[counter];

        if (number > 1) {
            let isPrime = true;

            for (let divisor = 2; divisor < number; divisor++) {
            if (number % divisor === 0) {
                    isPrime = false;
    }
      }

            if (isPrime) {
                temp[count] = number;
                count++;
            }
        }
    }

    let result = [];
    for (let counter = 0; counter < count; counter++) {
        result[counter] = temp[counter];
    }

    return result;
}






function replaceNegatives(numbers) {
    for (let counter = 0; counter < numbers.length; counter++) {
        if (numbers[counter] < 0) {
            numbers[counter] = 0;
        }
    }
    return numbers;
}


function findDuplicates(numbers) {
    let temp = new Array(numbers.length);
    let count = 0;

    for (let index = 0; index < numbers.length; index++) {
        for (let nextIndex = index + 1; nextIndex < numbers.length; nextIndex++) {

            if (numbers[index] === numbers[nextIndex]) {

             let alreadyExists = false;

              for (let checkIndex = 0; checkIndex < count; checkIndex++) {
                 if (temp[checkIndex] === numbers[index]) {
                    alreadyExists = true;
       }
              }

                if (!alreadyExists) {
                    temp[count] = numbers[index];
                    count++;
 }
  }
        }
    }

    let result = [];
    for (let resultIndex = 0; resultIndex < count; resultIndex++) {
        result[resultIndex] = temp[resultIndex];
    }

    return result;
}



function moveZeros(numbers) {
    let result = new Array(numbers.length);
    let position = 0;

    for (let counter = 0; counter < numbers.length; counter++) {
        if (numbers[i] !== 0) {
            result[position] = numbers[i];
            position++;
        }
    }

  
    for (let counter = position; counter < numbers.length; counter++) {
        result[i] = 0;
    }

    return result;
}






