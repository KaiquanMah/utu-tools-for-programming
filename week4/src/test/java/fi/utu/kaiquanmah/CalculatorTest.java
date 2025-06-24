package fi.utu.kaiquanmah;

// from https://gitlab.utu.fi/tools-for-programming/week-4/-/blob/main/CalculatorTest.java?ref_type=heads
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // from https://gitlab.utu.fi/tools-for-programming/week-4/-/blob/main/first_test.md?ref_type=heads
    @Test
    void getResult() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getResult());
    }

    // from https://gitlab.utu.fi/tools-for-programming/week-4/-/blob/main/more_tests.md?ref_type=heads
    @Test
    void add() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.add(-5);
        assertEquals(5, calculator.getResult());
    }

    // from https://gitlab.utu.fi/tools-for-programming/week-4/-/blob/main/more_tests.md?ref_type=heads
    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.multiply(2);
        calculator.multiply(-3);
        assertEquals(-30, calculator.getResult());
    }

    // from https://gitlab.utu.fi/tools-for-programming/week-4/-/blob/main/more_tests.md?ref_type=heads
    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.subtract(5);
        assertEquals(5, calculator.getResult());
    }


    // ADDED TEST FOR WEEK4 ASSIGNMENT
    @Test
    void reset() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.reset();
        assertEquals(0, calculator.getResult());
    }


    // ADDED TEST FOR WEEK4 ASSIGNMENT
    @Test
    void exponent() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.exponent(3);
        assertEquals(125, calculator.getResult());
    }

    
}
