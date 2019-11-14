package addandsubtract;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddAndSubtractTest {

    @Test
    public void testAddIntegers() {
        assertEquals(AddAndSubtract.addIntegers(2, 3), 5);
        assertEquals(AddAndSubtract.addIntegers(2, -3), -1);
    }
    
    @Test
    public void testSubtractIntegers() {
        assertEquals(AddAndSubtract.subtractIntegers(10, 4), 6);
        assertEquals(AddAndSubtract.subtractIntegers(8, -10), 18);
    }
    
}
