package hh;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(check("Программист"));
    }

    public static String check(String input) {
        var lower = input.toLowerCase();
        var s = lower.split(" ");
        StringBuilder result = new StringBuilder();

        for (String value : s) {
            result.append(value);
        }

        return isPalindrome(result.toString()) ? "Палиндром" : "Не палиндром";
    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
