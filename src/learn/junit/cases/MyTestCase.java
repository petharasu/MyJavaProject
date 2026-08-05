package learn.junit.cases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import learn.junit.functions.MyCalculator;

public class MyTestCase {

    private MyCalculator calc = new MyCalculator();

    @BeforeEach
    public void sumTc3() {
        System.out.println("testcase running");
    }

    @AfterAll
    public static void sumTc5() {
        System.out.println("all test cases completed");
    }

    @Test
    public void testTestCase() {
        assertEquals(1, 1);
    }

    @Test
    public void sumTc1() {
        int actualValue = calc.sum(2, 3);
        int expectedValue = 5;
        assertEquals(expectedValue, actualValue);
        System.out.println("test cases1");
    }

    @Test
    public void sumTc2() {
        assertEquals(10, calc.sum(2,5,1,2));
        System.out.println("test cases2");
    }

    @Test
    public void sumTc4() {
        assertNotEquals(9, calc.sub(5,6));
        System.out.println("test cases4");
    }
}