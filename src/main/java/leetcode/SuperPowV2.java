package leetcode;

public class SuperPowV2 {
    public static void main(String[] args) {
        int n = 703;

        String binaryString = Integer.toBinaryString(n);

        System.out.println(binaryString);

        int res = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == 0) continue;
            res += pow(2, i);
        }

        System.out.println(res);
    }

    private static int pow(int base, int power) {
        if (power == 0) return 1;

        int half = pow(base, power / 2);
        int res = half * half;

        if (power % 2 == 0) {
            return res;
        } else {
            return base * res;
        }
    }


    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        return 0;
    }

}
