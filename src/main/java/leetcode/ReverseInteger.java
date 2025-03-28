package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(Integer.MAX_VALUE));
    }

    public static int reverse(int x) {
        String s = reversValue(x);

        try {
            return Integer.parseInt(s);
        }
        catch (RuntimeException e) {
            return 0;
        }
    }

    private static String reversValue(int x) {
        boolean isNegative = x < 0;
        int end = isNegative ? 1 : 0;
        StringBuilder stringBuilder = new StringBuilder(isNegative ? "-" : "");

        String stringVal = String.valueOf(x);
        for (int i = stringVal.length() - 1; i >= end; i--) {
            stringBuilder.append(stringVal.charAt(i));
        }

        return stringBuilder.toString();
    }
}
