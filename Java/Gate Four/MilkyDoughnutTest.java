import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MilkyDoughnutTest {

    @Test
    public void testCountEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 6};

        int result = MilkyDoughnut.countEvenNumbers(numbers);

        Assertions.assertEquals(3, result);
 }

    @Test
    public void testLinearSearch_Found() {
        int[] numbers = {10, 20, 30, 40};

        int result = MilkyDoughnut.linearSearch(numbers, 30);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void testLinearSearch_NotFound() {
        int[] numbers = {10, 20, 30, 40};

        int result = MilkyDoughnut.linearSearch(numbers, 50);

        Assertions.assertEquals(-1, result);
}

    @Test
    public void testGenerateSquares() {
        int[] expected = {1, 4, 9, 16, 25};

        int[] result = MilkyDoughnut.generateSquares(5);

        Assertions.assertArrayEquals(expected, result);
 }




    @Test
    public void testAreArraysEqual_True() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        boolean result = MilkyDoughnut.areArraysEqual(array1, array2);

        Assertions.assertTrue(result);
    }

    @Test
    public void testAreArraysEqual_False() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 4};

        boolean result = MilkyDoughnut.areArraysEqual(array1, array2);

        Assertions.assertFalse(result);
    }
}
