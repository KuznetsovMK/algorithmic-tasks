package custom;

public class CountDigit {
    public int count(int n) {
        int result = 0;
        if (n < 0) {
            result++;
            n = -n;
        }

        return result + recursive(n);
    }

//    private int recursive(int n) {
//        if (n >= 0 && n <= 9) return 1;
//        return 1 + recursive(n / 10);
//    }

    private int recursive(int n) {
        if (n == 0) return 1;
        return 1 + recursive(n / 10);
    }
}
