package leetcode;

public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        long sum = 0;
        for (int i = 0; i < shifts.length; i++) {
            sum += shifts[i];
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int charInt = chars[i] - 'a';
            chars[i] = (char) ('a' + ((charInt + sum) % 26));

            sum -= shifts[i];
        }

        return new String(chars);
    }
}
