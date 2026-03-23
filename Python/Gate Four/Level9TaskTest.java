import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Level9TaskTest {

    @Test
    void testSplitEvenOdd() {
        int[] input = {1, 2, 3, 4};

        int[][] result = Level9Task.splitEvenOdd(input);

        assertArrayEquals(new int[]{1, 3}, result[0]); 
        assertArrayEquals(new int[]{2, 4}, result[1]); 
 }

    @Test
    void testPerfectSquares() {
        int[] input = {1, 2, 3, 4, 5, 9};

        int[] result = Level9Task.perfectSquares(input);

        assertArrayEquals(new int[]{1, 4, 9}, result);
}

    @Test
    void testIsPalindrome() {
        assertTrue(Level9Task.isPalindrome(new int[]{1, 2, 3, 2, 1}));
        assertFalse(Level9Task.isPalindrome(new int[]{1, 2, 3}));
   }

    @Test
    void testReplaceNonSquares() {
        int[] input = {1, 2, 3, 4};

        int[] result = Level9Task.replaceNonSquares(input);

        assertArrayEquals(new int[]{1, -1, -1, 4}, result);
   }
}
