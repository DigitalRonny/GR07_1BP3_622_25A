package ec.epn.edu.calculator;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ICalculatorTest {

    @Test
    public void given_two_integers_when_addition_then_ok() {
        System.out.println("Test with mockito 1");
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.addition(2,3)).thenReturn(5);
        Mockito.when(c.addition(3,2)).thenReturn(5);
        assertEquals(5,c.addition(3,2));
    }

    @Test
    void given_two_integers_when_subtraction_then_ok() {
        System.out.println("Test with mockito 2");
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.subtraction(5,3)).thenReturn(2);
        assertEquals(2,c.subtraction(5,3));
    }
}