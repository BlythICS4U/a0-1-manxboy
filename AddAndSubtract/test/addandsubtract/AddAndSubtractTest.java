package addandsubtract;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddAndSubtractTest {

    @Test
    public void testAddIntegers() {
        assertEquals(AddAndSubtract.addIntegers(2, 3), 5);
        assertEquals(AddAndSubtract.addIntegers(2, -3), -1);
    }
    
}
