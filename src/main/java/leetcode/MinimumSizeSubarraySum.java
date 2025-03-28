package leetcode;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int minCount = 0;
        int sum = 0;
        int result = -1;

        while (true) {
            if (sum < target) {
                if (end == nums.length) {
                    break;
                }

                sum += nums[end];
                end++;
                minCount++;
            } else {
                sum -= nums[start];
                start++;
                minCount--;
            }

            if (sum >= target && (result == -1 || result > minCount)) {
                result = minCount;
            }
        }

        return result == -1 ? 0 : result;
    }
}
