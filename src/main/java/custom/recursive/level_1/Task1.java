package custom.recursive.level_1;

public class Task1 {
    public int findFactor(int n) {
        if (n == 0) return 1;
        return n * findFactor(n - 1);
    }
}
