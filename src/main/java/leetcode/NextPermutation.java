package leetcode;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums2 = new int[]{0, 1, 2, 5, 3, 3, 0};
        int[] nums = new int[]{3,2,1};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {
        int value = 0;
        int index = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                value = nums[i - 1];
                index = i - 1;

                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (index != -1 && nums[i] > value) {
                nums[index] = nums[i];
                nums[i] = value;

                break;
            }
        }

        for (int i = nums.length - 1; i >= index + 1; i--) {
            for (int j = index + 1; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
