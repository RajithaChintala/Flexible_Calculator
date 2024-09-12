import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    public void testBasicOperations() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.calculate(Operation.ADD, 2, 3), 0.01);
        assertEquals(1, calculator.calculate(Operation.SUBTRACT, 3, 2), 0.01);
        assertEquals(6, calculator.calculate(Operation.MULTIPLY, 2, 3), 0.01);
        assertEquals(1.5, calculator.calculate(Operation.DIVIDE, 3, 2), 0.01);
    }

    @Test
    public void testChainingOperations() {
        Calculator calculator = new Calculator();
        assertEquals(11, calculator.chainOperations(5, Operation.ADD, 3, Operation.MULTIPLY, 2), 0.01);
    }

    @Test
    public void testUnsupportedOperation() {
        Calculator calculator = new Calculator();
        assertThrows(UnsupportedOperationException.class, () -> calculator.calculate(null, 2, 3));
    }
}