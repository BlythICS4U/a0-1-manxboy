package addandsubtract;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddAndSubtractTest {

    @Test
    public void testSum() {
        assertEquals(AddAndSubtract.sumIntegers(2, 3), 5);
        assertEquals(AddAndSubtract.sumIntegers(2, -3), -1);
    }
    
}
