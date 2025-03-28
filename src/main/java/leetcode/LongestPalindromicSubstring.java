package leetcode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "abb";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                left--;
            }

            while (right < s.length() && s.charAt(right) == s.charAt(i)) {
                right++;
            }

            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) != s.charAt(right)) {
                    break;
                }

                left--;
                right++;
            }

            left += 1;
            if (end - start < right - left) {
                start = left;
                end = right;
            }
        }

        return s.substring(start, end);
    }


}
