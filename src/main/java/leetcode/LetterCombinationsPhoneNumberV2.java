package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumberV2 {
    private Map<Integer, String> map = initMap();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
            result = concat(result, digit);
        }

        return result;
    }

    private List<String> concat(List<String> strings, int digit) {
        String string = map.getOrDefault(digit, "");

        if (strings.isEmpty()) {
            return concat(string);
        } else {
            return concat(strings, string);
        }
    }

    private List<String> concat(String string) {
        List<String> result = new ArrayList<>();

        for (int j = 0; j < string.length(); j++) {
            char c = string.charAt(j);
            result.add(String.valueOf(c));
        }

        return result;
    }

    private List<String> concat(List<String> strings, String string) {
        List<String> result = new ArrayList<>();

        for (String value : strings) {
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                result.add(value + c);
            }
        }

        return result;
    }

    private Map<Integer, String> initMap() {
        map = new HashMap<>();

        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        return map;
    }
}
