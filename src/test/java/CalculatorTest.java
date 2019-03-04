import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sum() {
        int a = 10;
        int b = 10;
        Calculator calculator = new Calculator();

        int sum = calculator.sum(a,b);

        assertEquals(20, sum);
    }
}