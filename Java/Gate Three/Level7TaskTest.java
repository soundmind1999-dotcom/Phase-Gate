import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Level7TaskTest {

    @Test
    public void testFindLargestIndexPosition() {
        
        double[][] inputOne = {{45.2, 90.28, 77.1}, {3.52, 9.86, 11.77}, {7.7, 10, 22.33, 12};
        int[] expectedOne = {0, 1};
        assertArrayEquals(expectedOne, Level7Task.findLargestIndexPosition(inputOne));

       
        double[][] inputTwo = {{1, 2, 3}, {4, 5, 6}, {7, 8, 99}};
        int[] expectedTwo = {2, 2};
        assertArrayEquals(expectedTwo, Level7Task.findLargestIndexPosition(inputTwo));

       
        double[][] inputThree= {{100, 50},{20, 30}};
        int[] expectedThree = {0, 0}; 
        assertArrayEquals(expectedThree, Level7Task.findLargestIndexPosition(inputThree));

 


 }






}
