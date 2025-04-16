package custom.recursive.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    Task3 task3 = new Task3();

    @Test
    void test1() {
        boolean result = task3.isPalindrome("aba");
        Assertions.assertTrue(result);
    }

    @Test
    void test2() {
        boolean result = task3.isPalindrome("abba");
        Assertions.assertTrue(result);
    }

    @Test
    void test3() {
        boolean result = task3.isPalindrome("asba");
        Assertions.assertFalse(result);
    }

    @Test
    void test4() {
        boolean result = task3.isPalindrome("a");
        Assertions.assertTrue(result);
    }

    @Test
    void test5() {
        boolean result = task3.isPalindrome("");
        Assertions.assertTrue(result);
    }

    @Test
    void test6() {
        boolean result = task3.isPalindrome("123");
        Assertions.assertTrue(result);
    }

    @Test
    void test7() {
        boolean result = task3.isPalindrome("123a");
        Assertions.assertTrue(result);
    }
}