import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MainTest {
    @Test
    public void addition() {
        assertEquals(2, Main.doAddition(1, 1));
        assertNotEquals(2, Main.doAddition(4, 2));
    }
}
