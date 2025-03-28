package leetcode;

import java.util.Arrays;

public class MergeIntervalsV2 {

    int prevStart = 0;
    int prevEnd = 0;
    int counter = 0;
    int[][] newIntervals = new int[0][0];

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (i == 0) {
                prevStart = start;
                prevEnd = end;
            } else {
                if (prevEnd >= start) {
                    prevEnd = Math.max(prevEnd, end);
                } else {
                    addInterval(start, end);
                }
            }

            if (i == intervals.length - 1) {
                addInterval(start, end);
            }
        }

        return newIntervals;
    }

    private void addInterval(int start, int end) {
        counter++;
        newIntervals = Arrays.copyOf(newIntervals, counter);

        int[] interval = new int[2];
        interval[0] = prevStart;
        interval[1] = prevEnd;

        newIntervals[counter - 1] = interval;

        prevStart = start;
        prevEnd = end;
    }
}
