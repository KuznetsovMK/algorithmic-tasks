package custom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountDigitTest {
    CountDigit countDigit = new CountDigit();

    @Test
    void test1() {
        int result = countDigit.count(0);
        Assertions.assertEquals(1, result);
    }

    @Test
    void test1_1() {
        int result = countDigit.count(1);
        Assertions.assertEquals(1, result);
    }

    @Test
    void test2() {
        int result = countDigit.count(11);
        Assertions.assertEquals(2, result);
    }

    @Test
    void test2_1() {
        int result = countDigit.count(-11);
        Assertions.assertEquals(3, result);
    }

    @Test
    void test3() {
        int result = countDigit.count(123);
        Assertions.assertEquals(3, result);
    }
}