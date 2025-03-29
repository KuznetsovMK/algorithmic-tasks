package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Pow_X_N_Test {
    Pow_X_N_ pow_X_N_;


    @BeforeEach
    void setUp() {
        pow_X_N_ = new Pow_X_N_();
    }

    @Test
    void test1() {
        double result = pow_X_N_.myPow(2.00000, 10);
        Assertions.assertEquals(1024.00000, result);
    }

    @Test
    void test2() {
        double result = pow_X_N_.myPow(2.10000, 3);
        Assertions.assertEquals(9.261000000000001, result);
    }

    @Test
    void test3() {
        double result = pow_X_N_.myPow(2.00000, -2);
        Assertions.assertEquals(0.25000, result);
    }
}