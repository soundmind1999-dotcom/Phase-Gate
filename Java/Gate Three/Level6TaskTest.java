import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Level6TaskTest {


    @Test
    public void testOneCharacter() {
        assertEquals("A1", Level6Task.numberingCharacter("A"));
  }

    @Test
    public void testConsecutiveCharacters() {
        assertEquals("A3B2C1", Level6Task.numberingCharacter("AAABBc".toUpperCase()));
    }

    @Test
    public void testMixedCharacters() {
        assertEquals("A1a2B2c1", Level6Task.numberingCharacter("AaaBBc"));
 }

    @Test
    public void testLongerCharacters() {
        assertEquals("E4n3e3", Level6Task.numberingCharacter("EEEEnnneee"));
  }

    @Test
    public void testeRepeatedCharacters() {
        assertEquals("o6Y1O2", Level6Task.numberingCharacter("ooooo0YOO"));
}

  



     }
