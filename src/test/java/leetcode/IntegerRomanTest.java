package leetcode;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerRomanTest {

    @Test
    public void test1() {
        String result = IntegerRoman.intToRoman(10);

        Assertions.assertEquals("X", result);
    }

    @Test
    public void test2() {
        String result = IntegerRoman.intToRoman(21);

        Assertions.assertEquals("XXI", result);
    }

    @Test
    public void test3() {
        String result = IntegerRoman.intToRoman(21);

        Assertions.assertNotEquals("AS", result);
    }
}