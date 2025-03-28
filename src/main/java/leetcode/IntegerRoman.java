package leetcode;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class IntegerRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }

    private static int sum;
    private static final Map<Integer, String> ROMAN_BY_INT = RomanEnum.initMap();

    public static String intToRoman(int num) {
        sum = num;

        return RomanEnum.sortedRoman()
                .stream()
                .map(e -> toRoman(e.value))
                .collect(Collectors.joining(""));
    }

    private static String toRoman(int romanVal) {
        int count = 0;

        if (sum >= romanVal) {
            count = sum / romanVal;
            sum -= count * romanVal;
        }

        return ROMAN_BY_INT
                .getOrDefault(romanVal, "")
                .repeat(count);
    }

    enum RomanEnum {
        I(1),
        IV(4),
        V(5),
        IX(9),
        X(10),
        XL(40),
        L(50),
        XC(90),
        C(100),
        CD(400),
        D(500),
        CM(900),
        M(1000);

        private final int value;

        RomanEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static List<RomanEnum> romanList() {
            return List.of(
                    I, IV, V, IX, X, XL,
                    L, XC, C, CD, D, CM, M
            );
        }

        public static List<RomanEnum> sortedRoman() {
            return romanList()
                    .stream()
                    .sorted(Comparator.comparingInt(RomanEnum::getValue).reversed())
                    .toList();
        }

        public static Map<Integer, String> initMap() {
            return romanList()
                    .stream()
                    .collect(toMap(
                            e -> e.value,
                            Enum::name
                    ));
        }
    }
}
