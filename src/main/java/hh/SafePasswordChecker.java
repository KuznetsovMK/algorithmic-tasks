package hh;

/*
* Вы разрабатываете программу для проверки безопасности паролей. Ваша задача — проверить набор паролей и определить, какие из них безопасны. Пароль считается таковым, если он удовлетворяет пяти условиям:
1. Содержит хотя бы одну заглавную букву;
2. Содержит хотя бы одну строчную букву;
3. Содержит хотя бы одну цифру;
4. Содержит хотя бы один специальный символ (допустимый набор символов: !@#$%^&*()-+);
5. Длина пароля больше или равна 8 символам.
Реализуйте метод, который принимает на вход один пароль и проверяет его на соответствие условиям. Проверьте каждый пароль в наборе с помощью этого метода и верните только безопасные пароли.
Формат ввода
Одна строка, в которой чередуются пароли, разделенные пробелами. Длина строки — не более 100 символов.
Формат вывода
Одна строка, в которой содержатся только безопасные пароли, разделенные пробелами. Выводите пароли в том порядке, в котором они были даны на вход. Если подходящих паролей нет, выводите «Не найдено» (без кавычек).*/

import java.util.ArrayList;
import java.util.List;

public class SafePasswordChecker {
    public static void main(String[] args) {
        System.out.println(findSafePasswords("Passwor Pas1 !Pa1sswo"));
    }

    private static final String specialChars = "!@#$%^&*()-+";

    public static String findSafePasswords(String input) {
        var result = new ArrayList<String>();
        String[] pswds = input.split(" ");

        for (String psw : pswds) {
            if (!checkLen(psw)) continue;
            if (!checkUpper(psw)) continue;
            if (!checkLower(psw)) continue;
            if (!checkDigit(psw)) continue;
            if (!checkSymbols(psw)) continue;

            result.add(psw);
        }

        return toString(result);
    }

    private static boolean checkLen(String psw) {
        return psw.length() >= 8;
    }

    private static boolean checkUpper(String psw) {
        var lowerCase = psw.toUpperCase();

        for (int i = 0; i < psw.length(); i++) {
            char aChar = psw.charAt(i);

            if (lowerCase.indexOf(aChar) != -1) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkLower(String psw) {
        var lowerCase = psw.toLowerCase();

        for (int i = 0; i < psw.length(); i++) {
            char aChar = psw.charAt(i);

            if (lowerCase.indexOf(aChar) != -1) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkDigit(String psw) {
        for (int i = 0; i < 10; i++) {
            if (psw.contains(String.valueOf(i))) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkSymbols(String psw) {
        for (int i = 0; i < psw.length(); i++) {
            if (specialChars.indexOf(psw.charAt(i)) != -1) {
                return true;
            }
        }

        return false;
    }

    private static String toString(List<String> list) {
        return String.join(" ", list);
    }
}
