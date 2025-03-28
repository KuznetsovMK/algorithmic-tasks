package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _3Sum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4, 5, 5, -10}));

        System.out.println();
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        var set = new HashSet<List<Integer>>();
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end) {
            int mid = start + 1;
            end = nums.length - 1;

            while (mid < end) {
                if (nums[start] + nums[mid] + nums[end] < 0) {
                    mid++;

                } else if (nums[start] + nums[mid] + nums[end] == 0) {
                    set.add(List.of(nums[start], nums[mid], nums[end]));
                    end--;
                    mid++;

                } else {
                    end--;
                }
            }

            start++;
        }

        return set.stream().toList();
    }
}
