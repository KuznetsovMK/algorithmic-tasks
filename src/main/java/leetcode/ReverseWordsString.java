package leetcode;

public class ReverseWordsString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        if (s.isBlank()) {
            return s;
        }

        String trim = s.trim();
        String[] s1 = trim.split(" ");

        String result = "";

        for (int i = s1.length - 1; i >= 0; i--) {
            if (s1[i].isBlank()) continue;

            if (!result.isEmpty()) {
                result = result + " ";
            }

            result = result + s1[i];
        }

        return result;
    }
}
