package leetcode;

import java.util.Arrays;

public class _3SumClosest {

    private int target = 0;
    private Integer resultSum = null;

    public int threeSumClosest(int[] nums, int target) {
        this.target = target;
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end) {
            int mid = start + 1;
            end = nums.length - 1;

            while (mid < end) {
                int sum = nums[start] + nums[mid] + nums[end];
                updateClosest(sum);

                if (sum > target) {
                    end--;
                } else if (sum == target) {
                    return sum;
                } else {
                    mid++;
                }
            }

            start++;
        }

        return resultSum;
    }

    private void updateClosest(int tempSum) {
        if (resultSum == null) {
            resultSum = tempSum;

            return;
        }

        int tempLen = Math.abs(target - tempSum);
        int resultLen = Math.abs(target - resultSum);

        if (tempLen > resultLen) {
            return;
        }

        resultSum = tempSum;
    }
}
