package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> pMap = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
        }

        int start = 0;
        int end = 0;

        while (end < s.length()) {
            sMap.put(s.charAt(end), sMap.getOrDefault(s.charAt(end), 0) + 1);

            if ((end - start + 1) == p.length()) {
                if (sMap.equals(pMap)) {
                    result.add(start);
                }

                if (sMap.get(s.charAt(start)) == 1) {
                    sMap.remove(s.charAt(start));
                } else {
                    sMap.put(s.charAt(start), sMap.get(s.charAt(start)) - 1);
                }

                start++;
            }

            end++;
        }

        return result;
    }
}
