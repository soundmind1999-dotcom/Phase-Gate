public class Level9Task {

    public static int[][] splitEvenOdd(int[] numbers) {
        int[] oddTemp = new int[numbers.length];
        int[] evenTemp = new int[numbers.length];
        int oddCount = 0;
        int evenCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenTemp[evenCount++] = number;
            } 

        else {
              oddTemp[oddCount++] = number;

            }
        }

        int[] oddNumbers = new int[oddCount];
        int[] evenNumbers = new int[evenCount];

        for (int counter = 0; counter < oddCount; counter++) {
            oddNumbers[counter] = oddTemp[counter];
        }

        for (int counter = 0; counter < evenCount; counter++) {
            evenNumbers[counter] = evenTemp[counter];
        }

        return new int[][]{oddNumbers, evenNumbers};
    }

 
    public static int[] perfectSquares(int[] numbers) {
        int[] temp = new int[numbers.length];
        int count = 0;

        for (int number : numbers) {
            for (int value = 0; value <= number; value++) {
                if (value * value == number) {
                    temp[count++] = number;
                }
            }
        }

        int[] squares = new int[count];
        for (int counter = 0; counter < count; counter++) {
            squares[counter] = temp[counter];
        }

        return squares;
    }


    public static boolean isPalindrome(int[] numbers) {
        for (int index = 0; index < numbers.length / 2; index++) {
            if (numbers[index] != numbers[numbers.length - 1 - index]) {
                return false;
            }
        }
        return true;
    }

    
    public static int[] replaceNonSquares(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            boolean isSquare = false;

            for (int value = 0; value <= numbers[index]; value++) {
                if (value * value == numbers[index]) {
                    isSquare = true;
                }
            }

            if (!isSquare) {
                numbers[index] = -1;
            }
        }

        return numbers;
    }





        public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 9};

     
        int[][] split = splitEvenOdd(numbers);
        System.out.println("Odd: " + Arrays.toString(split[0]));
        System.out.println("Even: " + Arrays.toString(split[1]));

        
        System.out.println("Perfect Squares: " + Arrays.toString(perfectSquares(numbers)));

        
        int[] palindromeTest = {1, 2, 3, 2, 1};
        System.out.println("Is Palindrome: " + isPalindrome(palindromeTest));

  
        System.out.println("Replace Non-Squares: " + Arrays.toString(replaceNonSquares(numbers)));
    }
}
