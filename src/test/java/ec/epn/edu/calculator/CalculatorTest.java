package ec.epn.edu.calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = null;

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
        System.out.println("setUp");
    }

    @Test
    public  void given_two_integers_when_addition_then_ok(){
        System.out.println("Test 1");
        assertEquals(4,calc.add(2,2));
    }

    @Test
    public  void given_two_integers_when_subtraction_then_ok(){
        System.out.println("Test 2");
        assertEquals(0, calc.subtraction(3,3));
    }

    @Test
    public  void given_two_integers_when_division_then_exception(){
        System.out.println("Test 3");
        assertThrows(ArithmeticException.class, () -> {
            calc.division(15, 0);  // Aquí lanzará la ArithmeticException
        });
    }

    @Test
    public  void given_two_integers_when_multiplication_then_timeout(){
        System.out.println("Test 4");
        assertTimeout(Duration.ofMillis(150), () -> {
            assertEquals(6, calc.multiplication(3, 2));
        });
    }

    @Test
    public  void given_two_integers_when_division_then_ok(){
        System.out.println("Test 5//");
        assertEquals(7, calc.division(35,5));
    }

    //ejecutar un metodo despues de que se ejecute cualquier test
    @AfterEach
    public void tearDown(){
        System.out.println("TearDown()");
        calc.setAns(0);
        calc = null;
    }

    @AfterAll
    public static void tearDownClass(){
        System.out.println("TearDownClass()");
    }

}