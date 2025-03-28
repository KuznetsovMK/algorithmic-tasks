package leetcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        Map<Character, Integer> map = new LinkedHashMap<>();

        int count = 0;
        char temp = '_';
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == temp) {
                count++;

            } else {
                result += ((count > 1) ? count : "");
                result += aChar;
                temp = aChar;
                count = 1;
            }

        }
        result = result + ((count > 1) ? count : "");

        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }

        Arrays.copyOf(chars, result.length());

        return result.length();
    }
}
