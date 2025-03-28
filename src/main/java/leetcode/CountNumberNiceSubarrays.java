package leetcode;

public class CountNumberNiceSubarrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,2,2,1,2,2,1,2,2,2};
        System.out.println(numberOfSubarrays(nums1, 2));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int result = 0;
        int count = 0;
        int[] counts = new int[nums.length + 1];
        counts[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                count++;
            }

            counts[count] += 1;

            if (count - k >= 0) {
                result += counts[count - k];
            }
        }

        return result;
    }
}
