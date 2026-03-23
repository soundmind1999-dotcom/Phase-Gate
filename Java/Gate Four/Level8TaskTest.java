import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Level8TaskTest {

    @Test
    void testGetPrimes() {
        int[] input = {5, 9, 3, 6, 2};
        int[] result = Level8Task.getPrimes(input);

        assertArrayEquals(new int[]{5, 3, 2}, result);
    }

    @Test
    void testReplaceNegatives() {
        int[] input = {1, -2, 3, -4};
        int[] result = Level8Task.replaceNegatives(input);

        assertArrayEquals(new int[]{1, 0, 3, 0}, result);
  }

    @Test
    void testMoveZeros() {
        int[] input = {1, 0, 2, 0, 3};
        int[] result = Level8Task.moveZeros(input);

        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, result);
}

    @Test
    void testFindDuplicates() {
        int[] input = {1, 2, 3, 2, 4, 1};
        int[] result = Level8Task.findDuplicates(input);

        assertArrayEquals(new int[]{2, 1}, result);
   }
}
