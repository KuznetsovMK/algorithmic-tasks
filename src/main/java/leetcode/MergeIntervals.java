package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals1 = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals = new int[][]{{1, 4}, {0, 4}};

        System.out.println(merge(intervals));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(e -> e[0]));
        int[][] merged = new int[intervals.length][2];
        int[] tempInterval = new int[2];
        int count = 0;

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (i == 0) {
                tempInterval[0] = start;
                tempInterval[1] = end;
                continue;
            }

            if (tempInterval[1] >= start && tempInterval[1] < end) {
                tempInterval[1] = end;

            } else if (start > tempInterval[1]) {
                merged[count][0] = tempInterval[0];
                merged[count][1] = tempInterval[1];
                count++;

                tempInterval[0] = start;
                tempInterval[1] = end;
            }
        }

        merged[count][0] = tempInterval[0];
        merged[count][1] = tempInterval[1];

        return Arrays.copyOf(merged, count + 1);
    }
}
