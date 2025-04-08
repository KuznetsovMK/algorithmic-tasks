package grokking_algorithms.chapter_8;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private final List<int[]> result = new ArrayList<>();

    public int[][] findSchedule(int[][] schedule) {
        var sorted = sort(schedule);
        findEarly(sorted);

        return mapping();
    }

    private int[][] sort(int[][] schedule) {
        for (int i = schedule.length - 1; i > 0; i--) {
            int min = schedule[0][1];

            for (int j = 1; j < i; j++) {
                if (schedule[j][1] < min) {
                    min = schedule[j][1];

                    int[] temp = schedule[j - 1];
                    schedule[j - 1] = schedule[j];
                    schedule[j] = temp;
                }
            }
        }

        return schedule;
    }

    private void findEarly(int[][] array) {
        if (array.length == 0) return;
        if (result.isEmpty()) result.add(array[0]);

        int[] lastPeriod = result.get(result.size() - 1);

        for (int[] period : array) {
            if (period[0] >= lastPeriod[1]) {
                result.add(period);
                lastPeriod = period;
            }
        }
    }

    private int[][] mapping() {
        int[][] array = new int[result.size()][2];

        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }

        return array;
    }
}
