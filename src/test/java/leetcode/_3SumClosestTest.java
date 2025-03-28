package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class _3SumClosestTest {
    leetcode._3SumClosest _3SumClosest = new _3SumClosest();

    @Test
    void test1() {
        int result = _3SumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        Assertions.assertEquals(2, result);
    }

    @Test
    void test2() {
        int result = _3SumClosest.threeSumClosest(new int[]{0,0,0}, 1);
        Assertions.assertEquals(0, result);
    }

    @Test
    void test3() {
        int result = _3SumClosest.threeSumClosest(new int[]{0, 1, 2}, 0);
        Assertions.assertEquals(3, result);
    }

    @Test
    void test4() {
        int result = _3SumClosest.threeSumClosest(new int[]{4, 0, 5, -5, 3, 3, 0, -4, -5}, -2);
        Assertions.assertEquals(-2, result);
    }
}