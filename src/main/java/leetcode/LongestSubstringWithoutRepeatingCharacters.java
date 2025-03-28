package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "bbbbb";

        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int result = 0;

        int start = 0;
        int end = 0;
        char[] chars = s.toCharArray();

        while (end < chars.length) {
            if (!set.add(chars[end])) {
                set.remove(chars[start]);
                start++;
                continue;
            }

            result = Math.max(result, set.size());
            end++;
        }

        return result;
    }
}
