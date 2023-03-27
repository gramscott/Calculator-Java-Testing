import org.example.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(1, 8);
    }

    @Test
    public void canAdd(){
        assertEquals(9, calculator.adding());
    }

    @Test
    public void canSubtract(){
        assertEquals(-7, calculator.subtracting());
    }

    @Test
    public void canMultiply(){
        assertEquals(8, calculator.multiplying());
    }

    @Test
    public void canDivide(){
        assertEquals(0, calculator.dividing());
    }

    



}
