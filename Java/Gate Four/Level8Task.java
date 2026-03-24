import java.util.Arrays;

public class Level8Task {

    public static int [] getPrimes(int [] numbers) {
        int [] temp = new int[numbers.length];
        int count = 0;

        for (int number : numbers) {
            if (number > 1) {
                boolean isPrime = true;

                for (int divisor = 2; divisor * divisor <= number; divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
       }
                }

                if (isPrime) {
                    temp[count++] = number;
      }
            }
        }

        int [] result = new int[count];
        for (int index = 0; index < count; index++) {
            result[index] = temp[index];
        }

        return result;
    }

    public static int [] replaceNegatives(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < 0) {
                numbers[index] = 0;
            }
        }
        return numbers;
    }

    public static int [] moveZeros(int[] numbers) {
        int[] result = new int[numbers.length];
        int position = 0;

        for (int number : numbers) {
            if (number != 0) {
                result[position++] = number;
            }
        }

        return result;
    }

    public static int[] findDuplicates(int[] numbers) {
        int[] temp = new int[numbers.length];
        int count = 0;

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            for (int nextIndex = currentIndex + 1; nextIndex < numbers.length; nextIndex++) {

                if (numbers[currentIndex] == numbers[nextIndex]) {

                    boolean alreadyExists = false;

                    for (int checkIndex = 0; checkIndex < count; checkIndex++) {
                        if (temp[checkIndex] == numbers[currentIndex]) {
                            alreadyExists = true;
                            break;
                 }
                    }

                    if (!alreadyExists) {
                        temp[count++] = numbers[currentIndex];
             }
  }
      }
        }

     
        int[] result = new int[count];
        for (int index = 0; index < count; index++) {
            result[index] = temp[index];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 9, 3, 6, 2, 0, -1, 3};

        System.out.println(Arrays.toString(getPrimes(numbers)));
        System.out.println(Arrays.toString(replaceNegatives(numbers)));
        System.out.println(Arrays.toString(moveZeros(numbers)));
        System.out.println(Arrays.toString(findDuplicates(numbers)));
    }
}
