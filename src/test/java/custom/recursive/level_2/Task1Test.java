package custom.recursive.level_2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {
    Task1 task1 = new Task1();

    @Test
    void test1() {
        String result = task1.reverseString("hello");
        Assertions.assertEquals("olleh", result);
    }
}