import com.goodline.homework.Calculator;
import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorTest {
    private Object IllegalArgumentException;

    @Test
    public void sumTest() {
        assertEquals(25, Calculator.Sum(10, 15));
    }
    @Test
    public void sumTestwithZero() {
        assertEquals(25, Calculator.Sum(0, 25));
        assertEquals(25, Calculator.Sum(25, 0));
        assertEquals(0, Calculator.Sum(0, 0));
    }
    @Test
    public void sumTestWithNegativ() {
        assertEquals(-10, Calculator.Sum(-20, 10));
        assertEquals(10, Calculator.Sum(20, -10));
        assertEquals(-30, Calculator.Sum(-20, -10));
    }
    @Test
    public void subTest() {
        assertEquals(50, Calculator.Sub(70, 20));
    }
    @Test
    public void subTestWithZero() {
        assertEquals(50, Calculator.Sub(50, 0));
        assertEquals(-50, Calculator.Sub(0, 50));
        assertEquals(0, Calculator.Sub(0, 0));
    }
    @Test
    public void subTestWithNegative() {
        assertEquals(50, Calculator.Sub(20, -30));
        assertEquals(-50, Calculator.Sub(-20, 30));
        assertEquals(10, Calculator.Sub(-20, -30));
    }
    @Test
    public void multTest() {
        assertEquals(6, Calculator.Mult(2,3));
    }
    @Test
    public void multTestWithZero() {
        assertEquals(0, Calculator.Mult(500, 0));
        assertEquals(0, Calculator.Mult(0, 5000));
        assertEquals(0, Calculator.Mult(0, 0));
    }
    @Test
    public void multTestWithNegativ() {
        assertEquals(-90, Calculator.Mult(-30, 3));
        assertEquals(-90, Calculator.Mult(30, -3));
        assertEquals(90, Calculator.Mult(-30, -3));
    }
    @Test
    public void divTest() {
        assertEquals(50,Calculator.Div(100, 2));
    }
    @Test
    public void divTestWithNigative() {
        assertEquals(-50, Calculator.Div(100, -2));
        assertEquals(-50, Calculator.Div(-100, 2));
        assertEquals(50, Calculator.Div(-100, -2));
    }
    @Test
    public void divTestWithZero() {
        assertEquals(0, Calculator.Mult(0, 2));
    }
//    @Test
//    public void divTestWithZeroError() {
//        assertEquals(IllegalArgumentException, Calculator.Mult(100, 0));
//    } не знаю как это проверить, но тест говорит что получается 0!
//    @Test
//    public void divTestWithZeroError() {
//          assertEquals(0, Calculator.Div(100, 0));
//          assertEquals(0, Calculator.Div(0, 0));
//   }
    @Test
    void testDiv() {
        try {
            Calculator.Div(20, 0);
            fail();
        } catch(Exception e) {
        }
    }
}

