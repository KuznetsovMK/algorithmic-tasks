package custom.recursive.level_2;

public class Task2 {

    public int bitRecursive(int n) {
        if (n == 0) return 0;
        return (n & 1) + bitRecursive(n >>= 1);
    }

    public int countOnesInBinary(int n) {
        String s = convertToString(n);
        return recursive(s);
    }

    private String convertToString(int n) {
        return Integer.toBinaryString(n);
    }

    private int recursive(String s) {
        if (s.isEmpty()) return 0;
        return Integer.parseInt(String.valueOf(s.charAt(0)))
                + recursive(s.substring(1));
    }
}
