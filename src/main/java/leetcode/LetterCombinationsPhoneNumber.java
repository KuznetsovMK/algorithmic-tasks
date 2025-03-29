package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber {
    private Map<Integer, String> map = initMap();

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        List<String> strings = getStrings(digits);

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            result.addAll(concat(s, strings, i + 1));
        }

        return result;
    }

    private List<String> getStrings(String digits) {
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
            String string = map.getOrDefault(digit, "");
            strings.add(string);
        }

        return strings;
    }

    private List<String> concat(String stringByDigit, List<String> strings, int start) {
        List<String> res = new ArrayList<>();

        if (strings.size() == 1) {
            return concat(' ', stringByDigit);
        }

        for (int i = start; i < strings.size(); i++) {
            String s = strings.get(i);

            for (char aChar : stringByDigit.toCharArray()) {
                res.addAll(concat(aChar, s));
            }
        }

        return res;
    }

    private List<String> concat(char aChar, String string) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            res.add(String.valueOf(aChar).trim() + string.charAt(i));
        }

        return res;
    }

    private Map<Integer, String> initMap() {
        map = new HashMap<>();

        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");

        return map;
    }
}
