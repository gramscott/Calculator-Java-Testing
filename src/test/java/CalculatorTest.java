import org.example.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;


    @Before
    public void Before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(4, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(40, calculator.multiply(4, 10));
    }

    @Test
    public void canDivide(){
        assertEquals(5.0, calculator.divide(25.0, 5.0), 0.0);
    }


}
