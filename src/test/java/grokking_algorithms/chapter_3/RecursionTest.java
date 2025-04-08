package grokking_algorithms.chapter_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursionTest {
    Recursion recursion;

    @BeforeEach
    void setUp() {
        recursion = new Recursion();
    }

    @Test
    void factorialTest() {
        long result = recursion.findFactorial(5);
        Assertions.assertEquals(120L, result);
    }
}