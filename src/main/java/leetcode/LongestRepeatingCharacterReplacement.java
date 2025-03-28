package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        System.out.println(characterReplacement(s, k));
    }

    public static int characterReplacement(String s, int k) {
        if (s.length() == 1) {
            return 1;
        }

        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            set.add(aChar);
        }

        int result = 0;

        for (Character character : set) {
            int start = 0;
            int end = 0;
            int count = 0;
            int replace = k;

            while (end < s.length()) {
                if (s.charAt(end) == character) {
                    count++;
                    result = Math.max(result, count);
                    end++;
                } else if (replace > 0) {
                    count++;
                    result = Math.max(result, count);
                    replace--;
                    end++;
                } else if (replace == 0) {
                    if (s.charAt(start) != character) {
                        replace++;
                    }

                    count--;
                    start++;
                }
            }
        }

        return result;
    }
}
