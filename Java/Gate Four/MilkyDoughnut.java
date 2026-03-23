public class MilkyDoughnut {


    public static int countEvenNumbers(int[] numbers) {
        int evenCount = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }


    public static int linearSearch(int[] numbers, int targetValue) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == targetValue) {
                return index;
            }
        }
        return -1;
    }

 
    public static int[] generateSquares(int size) {
        int[] squaresArray = new int[size];

        for (int index = 0; index < size; index++) {
            squaresArray[index] = (index + 1) * (index + 1);
        }

        return squaresArray;
    }


    public static boolean areArraysEqual(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int index = 0; index < firstArray.length; index++) {
            if (firstArray[index] != secondArray[index]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        int evenResult = countEvenNumbers(numbers);
        System.out.println("Even numbers count: " + evenResult);

        int searchResult = linearSearch(numbers, 4);
        System.out.println("Index of 4: " + searchResult);

       
        int[] squares = generateSquares(5);
        System.out.print("Squares: ");
        for (int i = 0; i < squares.length; i++) {
            System.out.print(squares[i] + " ");
        }
        System.out.println();

   
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        boolean isEqual = areArraysEqual(array1, array2);
        System.out.println("Arrays are equal: " + isEqual);
    }
}
