import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Level5TaskTest {

    @Test
    public void testForDifferentPossibilities() {
        assertArrayEquals(new int[]{10, 11, 12, -1, -1}, Level5Task.completeArray(new int[]{10, 11, 12}, 5));
        assertArrayEquals(new int[]{10, 11}, Level5Task.completeArray(new int[]{10, 11, 12, 13, 14}, 2));
        assertArrayEquals(new int[]{-1, -1, -1, -1}, Level5Task.completeArray(new int[]{}, 4));
        assertArrayEquals(new int[]{}, Level5Task.completeArray(new int[]{1,2,3}, 0));
        assertArrayEquals(new int[]{}, Level5Task.completeArray(new int[]{}, 0));
        assertArrayEquals(new int[]{5, -1, -1}, Level5Task.completeArray(new int[]{5}, 3));
}



     }
