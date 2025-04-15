package custom;

public class ArithmeticProgression {
    public int getSum(int n) {
        if (n <= 0) return 0;
        return n + getSum(n - 1);
    }
}
