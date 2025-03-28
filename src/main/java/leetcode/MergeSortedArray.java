package leetcode;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            integers.add(nums1[i]);

        }

        for (int num2 : nums2) {
            integers.add(num2);
        }

        AtomicInteger count = new AtomicInteger(0);

        integers
                .stream()
                .sorted()
                .forEach(e -> {
                    nums1[count.get()] = e;
                    count.getAndIncrement();
                });
    }
}
