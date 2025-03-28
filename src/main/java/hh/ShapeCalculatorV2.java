package hh;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ShapeCalculatorV2 {
    public static void main(String[] args) {
        System.out.println(calc("квадрат"));
    }

    public static String calc(String input) {
        double len = 1d;
        double sq = 0;
        double p = 0;

        String[] s = input.split(" ");

        if (s.length == 2) {
            len = Double.parseDouble(s[1]);
        }

        if ("круг".equals(s[0])) {
            sq = Math.PI * Math.pow(len, 2);
            p = 2 * len * Math.PI;
        } else if ("квадрат".equals(s[0])) {
            sq = Math.pow(len, 2);
            p = len * 4;
        }

        return getResult(sq, p);
    }

    private static String getResult(double s, double p) {
        var decimalFormat = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.ENGLISH));

        return decimalFormat.format(s) + " " + decimalFormat.format(p);
    }
}
