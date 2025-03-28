package leetcode;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaximumNumberVowelsSubstringGivenLength {
    public static void main(String[] args) {
        String str = "abciiidef";
        System.out.println(maxVowels(str, 3));
    }

    public static int maxVowels(String s, int k) {
        Set<Character> vowels =
                Stream
                        .of('a', 'e', 'i', 'o', 'u')
                        .collect(Collectors.toSet());

        int result = 0;
        int tempCount = 0;

        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;

        while (end < chars.length) {
            if (vowels.contains(chars[end])) {
                tempCount++;

                result = Math.max(result, tempCount);
            }

            if ((end - start + 1) == k) {
                if (vowels.contains(chars[start])) {
                    tempCount--;
                }
                start++;
            }

            end++;
        }

        return result;
    }
}
