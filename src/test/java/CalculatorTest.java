import com.rest.app.Calculator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void multiplyTest() {
        calculator = new Calculator();

        assertEquals(20, calculator.multiply(5, 4));
    }

    @Test
    public void divideTest() {
        calculator = new Calculator();

        assertEquals(20, calculator.divide(80, 4));
    }
}
