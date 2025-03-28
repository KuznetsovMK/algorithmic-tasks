package leetcode;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        var result = new HashSet<Integer>();

        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    result.add(num2);
                }
            }
        }

        return result
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
