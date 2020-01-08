package tbs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RedundantAssertionTest {
    @Test
    public void testTrue() {
        Calculate calculate = new Calculate();
        int result = calculate.add(7, 8);
        int success = 15;

        assertEquals(true, true);
    }
}
