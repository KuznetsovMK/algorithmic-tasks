package codewars.kyu5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
 */

public class PrimesInNumbers {

    public static void main(String[] args) {
        System.out.println(factors(7775460));

    }


    public static String factors(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    n = n / i;
                    list.add(i);
                    break;
                }
            }
        }

        return list.stream()
                .collect(Collectors
                        .groupingBy(Function.identity()
                                , Collectors.counting()
                        ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByKey())
                .map(entry ->
                        String.format(
                                entry.getValue() > 1 ? "(%d**%d)" : "(%d)", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining());
    }
}
