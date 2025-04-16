package custom.recursive.level_2;

public class Task3 {

    public boolean isPalindrome(String str) {
        String modified = modify(str);

        if (modified.isEmpty() || modified.length() == 1) return true;
        return isEquals(0, str.length() - 1, modified);
    }

    private boolean isEquals(int left, int right, String string) {
        if (left >= right) return true;

        boolean res = string.charAt(left) == string.charAt(right);
        return res && isEquals(left + 1, right - 1, string);
    }

    private String modify(String string) {
        return clear(string).toLowerCase();
    }

    private String clear(String str) {
        return str.replaceAll("[^A-Za-zА-Яа-я]", "");
    }
}
