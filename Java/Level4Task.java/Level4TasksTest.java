import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.AssertEquals;

public class Level4TasksTest {

    @Test
    void testThatTheAdditionOfTwoPositiveNumbers() {
        Addition cal = new Addition();
        assertEquals(5, cal.addTwoNumbers(2, 3));
    


}

    @Test    
    void testTheAdditionOfTwoNegativeNumbers() {
        Addition cal = new Addition();
        assertEquals(-5, cal.addTwoNumbers(-2, -3));
   


 }

    @Test
    void testIfNumberIsEvenTrue() {
        EvenNumber even = new EvenNumber();
        assertTrue(even.checkEvenNumber(4));
    

}

    @Test
    void testIfNumberIsEvenFalse() {
        EvenNumber even = new EvenNumber();
        assertFalse(even.checkEvenNumber(3));
    }

    @Test    
    void testSquareOfAPositiveNumber() {
        SquareOfNumber square = new SquareOfNumber();
        assertEquals(4, square.squareOfANumber(2));
    }

    @Test
    void testSquareOfANegativeNumber() {
        SquareOfNumber square = new SquareOfNumber();
        assertEquals(4, square.squareOfANumber(-2));
}

    @Test
    void testForLowCelsiusTemperature() {
        Temperature temp = new Temperature();
        assertEquals(23, temp.temperatureConverter(-5));   
}

    @Test
    void testForHighCelsiusTemperature() {
        Temperature temp = new Temperature();
        assertEquals(131, temp.temperatureConverter(55));
 }

    @Test
    void testForNegativeThreeNumbers() {
        Numbers num = new Numbers();
        assertEquals(-4, num.largestOfThreeNumbers(-5, -4, -7));
 }

    @Test
    void testForPositiveThreeNumbers() {
        Numbers num = new Numbers();
        assertEquals(7, num.largestOfThreeNumbers(5, 4, 7));
 }

    @Test
    void testForALargerLengthAndASmallerWidth() {
        Rectangle rec = new Rectangle();
        assertEquals(500, rec.areaOfRectangle(100, 5)); 
}

    @Test
    void testForASmallerLengthAndALargerWidth() {
        Rectangle rec = new Rectangle();
        assertEquals(320, rec.areaOfRectangle(4, 80));
    }
}
