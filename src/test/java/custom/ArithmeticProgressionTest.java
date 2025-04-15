package custom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArithmeticProgressionTest {
    ArithmeticProgression task = new ArithmeticProgression();

    @Test
    void getSum() {
        int sum = task.getSum(5);
        Assertions.assertEquals(15, sum);
    }

    @Test
    void test2() {
        int sum = task.getSum(-1);
        Assertions.assertEquals(0, sum);
    }
}