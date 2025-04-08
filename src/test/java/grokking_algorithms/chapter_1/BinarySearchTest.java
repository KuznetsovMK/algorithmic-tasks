package grokking_algorithms.chapter_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void test1() {
        int result = binarySearch.lb(128);
        Assertions.assertEquals(7, result);
    }

    @Test
    void test2() {
        int result = binarySearch.lb(100);
        Assertions.assertEquals(7, result);
    }

    @Test
    void test3() {
        int result = binarySearch.lb(240000);
        Assertions.assertEquals(18, result);
    }

    @Test
    void test4() {
        int result = binarySearch.lb(128 * 2);
        Assertions.assertEquals(8, result);
    }
}