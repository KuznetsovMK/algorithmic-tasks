package leetcode;

public class ZigzagConversionV2 {
    public static void main(String[] args) {
        var s = "A";
        int numRows = 1;

        System.out.println(convert(s, numRows));
    }

    private static String result = "";

    public static String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows == 1) {
            return s;
        }

        int gap = (numRows - 1) * 2;

        for (int i = 0; i < numRows; i++) {
            addToResult(s, i, gap);
        }

        return result;
    }

    private static void addToResult(String string, int i, int gap) {
        int start = i;
        int end = gap - i;

        if (start + gap == end || start == end) {
             addSingle(string, start, gap);
        } else {
            addMulti(string, start, gap);
        }
    }

    private static void addSingle(String string, int i, int gap) {
        while (i < string.length()) {
            result += string.charAt(i);
            i += gap;
        }
    }

    private static void addMulti(String string, int i, int gap) {
        int start = i;
        int end = gap - i;

        while (true) {
            if (start >= string.length()) break;
            result += string.charAt(start);

            if (end >= string.length()) break;
            result += string.charAt(end);

            start += gap;
            end += gap;
        }
    }
}
