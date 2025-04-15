package custom.recursive.level_1;

public class Task2 {
    public int findSum(int n) {
        if (n == 1) return 1;
        return n + findSum(n - 1);
    }
}
