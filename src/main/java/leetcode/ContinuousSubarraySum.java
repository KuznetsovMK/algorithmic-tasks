package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] nums2 = new int[]{23, 2, 4, 6, 7};
        int[] nums3 = new int[]{5, 0, 0, 0};
        int[] nums4 = new int[]{23, 2, 4, 6, 6};
        int[] nums5 = new int[]{0};
        int[] nums6 = new int[]{1, 2, 3, 4, 5, 6};
        int[] nums = new int[]{23, 2, 4, 6, 6};
        int k = 7;

        System.out.println(checkSubarraySum(nums, k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k;

            if (map.containsKey(sum)) {
                Integer index = map.get(sum);
                if (i - index > 1) {
                    return true;
                }
            } else {
                map.put(sum, i);
            }
        }

        return false;
    }
}
