package custom.recursive.level_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task2Test {
    Task2 task2 = new Task2();

    @Test
    void test2() {
        int result = task2.findSum(1);
        Assertions.assertEquals(1, result);
    }

    @Test
    void test3() {
        int result = task2.findSum(5);
        Assertions.assertEquals(15, result);
    }

    @Test
    void test4() {
        int result = task2.findSum(3);
        Assertions.assertEquals(6, result);
    }
}