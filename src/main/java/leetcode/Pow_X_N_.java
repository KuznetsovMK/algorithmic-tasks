package leetcode;

import java.math.BigDecimal;

public class Pow_X_N_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(2.10000));
        System.out.println(bigDecimal.doubleValue());

        double res = 1;

        for (int i = 0; i < 2000; i++) {
            res *= bigDecimal.doubleValue();
            System.out.println(res);
        }
    }

    public double myPow(double x, int n) {
        return n < 0
                ? 1 / pow(x, n * -1)
                : pow(x, n);
    }

    private double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double half = pow(x, n / 2);
        double res = half * half;

        return n % 2 == 0
                ? res
                : x * res;
    }
}
