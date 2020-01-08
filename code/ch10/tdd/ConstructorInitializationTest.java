package tbs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInitializationTest {
    @Before
    public void init() throws Exception {

    }

    @Test
    public void name() {
        Calculate calculate = new Calculate();
        int result = calculate.add(7, 8);
        int success = 15;
        assertEquals(success, result);
    }
}
