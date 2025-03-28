package hh;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StatsCalculator {
    public static void main(String[] args) {
        System.out.println(calculateStats("5 -2 0 0 7 8 -1"));
    }

    public static String calculateStats(String input) {
        Map<String, Integer> result = new LinkedHashMap<>();

        result.put("выше нуля", 0);
        result.put("ниже нуля", 0);
        result.put("равна нулю", 0);

        String[] s = input.split(" ");

        for (int i = 0; i < s.length; i++) {
            if (Integer.parseInt(s[i]) > 0) {
                result.put("выше нуля", result.get("выше нуля") + 1);
            } else if (Integer.parseInt(s[i]) == 0) {
                result.put("равна нулю", result.get("равна нулю") + 1);
            } else if (Integer.parseInt(s[i]) < 0) {
                result.put("ниже нуля", result.get("ниже нуля") + 1);
            }
        }

        return result
                .entrySet()
                .stream()
                .map(e -> String.format("%s: %s", e.getKey(), e.getValue()))
                .collect(Collectors.joining(", "));
    }
}
