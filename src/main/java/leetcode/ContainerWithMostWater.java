package leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 2, 1}));
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;

        int maxS = 0;

        while (start <= end) {
            int left = height[start];
            int right = height[end];
            int minHeight = Math.min(left, right);

            maxS = Math.max(maxS, (minHeight * (end - start)));

            if (left < right) {
                start++;
            } else {
                end--;
            }
        }

        return maxS;
    }
}
