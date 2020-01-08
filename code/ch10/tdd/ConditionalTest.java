package tbs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConditionalTest {
    @Test
    public void byGod() {
        Calculate calculate = new Calculate();
        // just examples
        if (calculate.add(7, 9) == 16) {
            if (calculate.sub(12, 9) == 3) {
                int subSuccess = 7;
                assertEquals(subSuccess, calculate.sub(9, 2));
            }
        }
    }
}
