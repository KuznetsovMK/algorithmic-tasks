package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class IntegerRomanTest {

    @Test
    public void test1() {
        String result = IntegerRoman.intToRoman(10);

        Assert.assertEquals("X", result);
    }

    @Test
    public void test2() {
        String result = IntegerRoman.intToRoman(21);

        Assert.assertEquals("XXI", result);
    }

    @Test
    public void test3() {
        String result = IntegerRoman.intToRoman(21);

        Assert.assertNotEquals("AS", result);
    }
}