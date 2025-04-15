package custom.recursive.level_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {
    Task1 task1 = new Task1();

    @Test
    void test1() {
        int result = task1.findFactor(0);
        Assertions.assertEquals(1, result);
    }

    @Test
    void test2() {
        int result = task1.findFactor(5);
        Assertions.assertEquals(120, result);
    }

    @Test
    void test3() {
        int result = task1.findFactor(5);
        Assertions.assertEquals(120, result);
    }

    @Test
    void test4() {
        int result = task1.findFactor(10);
        Assertions.assertEquals(3628800, result);
    }
}