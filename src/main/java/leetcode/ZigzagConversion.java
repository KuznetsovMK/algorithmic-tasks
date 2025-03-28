package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows == 1) return s;

        var array = initArray(numRows);
        splitToArray(array, s, numRows);

        return getResult(array);
    }

    private static List<Character>[] initArray(int numRows) {
        List<Character>[] array = new ArrayList[numRows];

        for (int i = 0; i < numRows; i++) {
            array[i] =  new ArrayList<>();
        }

        return array;
    }

    private static void splitToArray(List<Character>[] array, String s, int numRows) {
        int index = 0;
        int forward = 1;
        int back = -1;
        int step = forward;

        for (int j = 0; j < s.length(); j++) {
            List<Character> characters = array[index];
            characters.add(s.charAt(j));

            index += step;

            if (index + 1 == numRows) {
                step = back;
            } else if (index == 0) {
                step = forward;
            }
        }
    }

    private static String getResult(List<Character>[] array) {
        var result = new StringBuilder();

        for (List<Character> list : array) {
            list.forEach(result::append);
        }

        return result.toString();
    }
}
