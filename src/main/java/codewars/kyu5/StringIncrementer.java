package codewars.kyu5;

import java.math.BigDecimal;

/**
 * Your job is to write a function which increments a string, to create a new string.
 * <p>
 * If the string already ends with a number, the number should be incremented by 1.
 * If the string does not end with a number. the number 1 should be appended to the new string.
 * Examples:
 * <p>
 * foo -> foo1
 * <p>
 * foobar23 -> foobar24
 * <p>
 * foo0042 -> foo0043
 * <p>
 * foo9 -> foo10
 * <p>
 * foo099 -> foo100
 * <p>
 * Attention: If the number has leading zeros the amount of digits should be considered.
 */

public class StringIncrementer {
    private StringIncrementer() {
    }

    public static String incrementString(String str) {
        var number = new StringBuilder();
        var string = new StringBuilder();
        var numberEndIndex = -1;

        char[] chars = new StringBuilder(str).reverse().toString().toCharArray();

        if (str.isEmpty() || !isNumeric(chars[0])) {
            return string.append(str).append(1).toString();
        }

        for (int i = 0; i < chars.length; i++) {
            if (isNumeric(chars[i])) {
                number.append(chars[i]);
            } else {
                numberEndIndex = i;
                break;
            }
        }

        var result = new BigDecimal(number.reverse().toString());

        return new StringBuilder(str).substring(0, numberEndIndex != -1 ? str.length() - numberEndIndex : 0)
                + (convertIntegerToStringLength((result.add(BigDecimal.valueOf(1))), number.length()));
    }

    static boolean isNumeric(char c) {
        return (c >= '0' && c <= '9');
    }

    static String convertIntegerToStringLength(BigDecimal value, int stringLength) {
        var result = new StringBuilder();
        var valueLength = String.valueOf(value).length();

        result.append("0".repeat(Math.max(0, stringLength - valueLength)));

        return result.append(value).toString();
    }
}
