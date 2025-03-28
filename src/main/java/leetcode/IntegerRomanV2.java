package leetcode;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toMap;

public class IntegerRomanV2 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }

    private static final Map<Integer, String> ROMAN = initRomanMap();
    private static int sum;

    public static String intToRoman(int num) {
        sum = num;

        return RomanEnum.sortedRomanValue()
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

        return ROMAN.getOrDefault(romanVal, "").repeat(count);
    }

    private static Map<Integer, String> initRomanMap() {
        return
                RomanEnum.collectRoman()
                        .stream()
                        .collect(toMap(
                                e -> e.value,
                                Enum::name
                        ));
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

        public static List<RomanEnum> collectRoman() {
            return List.of(
                    RomanEnum.I,
                    RomanEnum.IV,
                    RomanEnum.V,
                    RomanEnum.IX,
                    RomanEnum.X,
                    RomanEnum.XL,
                    RomanEnum.L,
                    RomanEnum.XC,
                    RomanEnum.C,
                    RomanEnum.CD,
                    RomanEnum.D,
                    RomanEnum.CM,
                    RomanEnum.M
            );
        }

        public static List<RomanEnum> sortedRomanValue() {
            return
                    collectRoman()
                            .stream()
                            .sorted(comparing(RomanEnum::getValue).reversed())
                            .toList();
        }
    }
}
