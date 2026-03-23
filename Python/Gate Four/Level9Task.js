function splitEvenOdd(numbers) {
    let oddTemp = new Array(numbers.length);
    let evenTemp = new Array(numbers.length);
    let oddCount = 0;
    let evenCount = 0;

    for (let index = 0; index < numbers.length; index++) {
        let number = numbers[index];

        if (number % 2 === 0) {
            evenTemp[evenCount++] = number;
        } else {
            oddTemp[oddCount++] = number;
 }
    }

    let oddNumbers = [];
    let evenNumbers = [];

    for (let counter = 0; counter < oddCount; counter++) {
        oddNumbers[counter] = oddTemp[counter];
 }

    for (let counter = 0; counter < evenCount; counter++) {
        evenNumbers[counter] = evenTemp[counter];
    }

    return [oddNumbers, evenNumbers];
}





function perfectSquares(numbers) {
    let temp = new Array(numbers.length);
    let count = 0;

    for (let index = 0; index < numbers.length; index++) {
        let number = numbers[index];

        for (let value = 0; value <= number; value++) {
            if (value * value === number) {
                temp[count++] = number;
  }
 }
    }

        let squares = [];
        for (let counter = 0; counter < count; counter++) {
            squares[counter] = temp[counter];
    }

    return squares;
}




function isPalindrome(numbers) {
    let half = numbers.length / 2;

    for (let index = 0; index < half; index++) {
        if (numbers[index] !== numbers[numbers.length - 1 - index]) {
            return false;
      }
    }
    return true;
}






function replaceNonSquares(numbers) {
    for (let index = 0; index < numbers.length; index++) {
        let isSquare = false;

        for (let value = 0; value <= numbers[index]; value++) {
            if (value * value === numbers[index]) {
                isSquare = true;
   }
        }

        if (!isSquare) {
            numbers[index] = -1;
}
    }

    return numbers;
}



