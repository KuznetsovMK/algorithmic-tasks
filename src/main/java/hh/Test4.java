package hh;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test4 {

    public static String findDrops(String input) {
        String[] s = input.split(" ");
        var result = new ArrayList<>();

        for (int i = 1; i < s.length; i++) {
            if ((Integer.parseInt(s[i - 1]) - Integer.parseInt(s[i])) >= 3) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            return "Нет";
        }

        return result
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}
