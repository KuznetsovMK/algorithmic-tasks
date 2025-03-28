package hh;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println(calc("круг 3"));
    }
    private static double len;

    public static String calc(String input) {
        String[] s = input.split(" ");
        len = s.length > 1 ? Double.parseDouble(s[1]) : 1;

        if (input.startsWith("кв")) {
            return getResult(s(ShapeType.КВАДРАТ), p(ShapeType.КВАДРАТ));
        } else if (input.startsWith("кр")) {
            return getResult(s(ShapeType.КРУГ), p(ShapeType.КРУГ));
        } else {
            return "";
        }
    }

    private static String getResult(double s, double p) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));
        return decimalFormat.format(s) + " " + decimalFormat.format(p) ;
    }

    private enum ShapeType {
        КРУГ,
        КВАДРАТ
    }

    private static double s(ShapeType type) {
        switch (type) {
            case КРУГ -> {
                return Math.PI * Math.pow(len, 2);
            }
            case КВАДРАТ -> {
                return Math.pow(len, 2);
            }
        }

        return 0;
    }

    private static double p(ShapeType type) {
        switch (type) {
            case КРУГ -> {
                return 2 * Math.PI * len;
            }
            case КВАДРАТ -> {
                return 4 * len;
            }
        }

        return 0;
    }
}
