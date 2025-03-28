package leetcode;

import java.util.Arrays;

public class MaxNumberKSumPairs {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,3,4,3};
        System.out.println(maxOperations(nums, 6));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        int sum;
        int count = 0;
        while (start < end) {
            sum = nums[start] + nums[end];
            if (sum == k) {
                count++;
                start++;
                end--;
            } else if (sum > k) {
                end--;
            } else {
                start++;
            }
        }

        return count;
    }
}
