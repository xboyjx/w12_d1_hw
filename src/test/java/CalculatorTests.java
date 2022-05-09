import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTests {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4,calculator.add(3,1));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(3,1));
    }

    @Test
    public void canMultiply(){
        assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    public void canDivide(){
        assertEquals(2.5, calculator.divide(5,2), 0.0);
    }
}
