package custom.recursive.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {
    Task2 task2 = new Task2();

    @Test
    void test1() {
        int result = task2.countOnesInBinary(8);
        Assertions.assertEquals(1, result);
    }

    @Test
    void test2() {
        int result = task2.countOnesInBinary(5);
        Assertions.assertEquals(2, result);
    }

    @Test
    void test3() {
        int result = task2.bitRecursive(5);
        Assertions.assertEquals(2, result);
    }

    @Test
    void test4() {
        int result = task2.bitRecursive(8);
        Assertions.assertEquals(1, result);
    }
}
