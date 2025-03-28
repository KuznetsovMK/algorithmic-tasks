package leetcode;

public class StringToInteger {
    public static int myAtoi(String s) {
        String str = s.trim();
        boolean negative = false;
        int result = 0;

        char[] chars = str.toCharArray();
        int index = 0;

        while (index < str.length() && isNegativeOrPositive(chars[index])) {
            if (isNegative(chars[index])) {
                negative = true;
            }

            index++;
            break;
        }

        while (index < str.length() && isInt(chars[index])) {
            int digit = Integer.parseInt(String.valueOf(chars[index]));

            if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;

            index++;
        }

        return negative ? result * -1 : result;
    }

    private static boolean isNegative(char chr) {
        return chr == '-';
    }

    private static boolean isInt(char chr) {
        try {
            Integer.parseInt(String.valueOf(chr));
            return true;

        } catch (RuntimeException e) {
            return false;
        }
    }

    private static boolean isNegativeOrPositive(char chr) {
        return chr == '-' || chr == '+';
    }
}
