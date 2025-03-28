package leetcode;

public class CanPlaceFlowers {

    private static int planted = 0;

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                plantFlower(flowerbed, i, i == 0 ? i : i - 1, i == flowerbed.length - 1 ? i : i + 1);
            }

            if (planted >= n) {
                return true;
            }
        }

        return false;
    }

    private static void plantFlower(int[] flowerbed, int current, int left, int right) {
        if (flowerbed[left] == 0 && flowerbed[right] == 0) {
            flowerbed[current] = 1;
            planted++;
        }
    }
}
