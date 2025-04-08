package grokking_algorithms.chapter_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScheduleTest {
    Schedule schedule = new Schedule();

    @Test
    void test1() {
        int[][] sorted = new int[][]{{9, 11}, {10, 12}, {11, 13}, {12, 14}, {13, 15}};
        var result = schedule.findSchedule(sorted);
        Assertions.assertArrayEquals(new int[][]{{9, 11}, {11, 13}, {13, 15}}, result);
    }

    @Test
    void test2() {
        int[][] array = new int[][]{{12, 14}, {11, 13}, {10, 12}, {9, 11}, {13, 15}};
        var result = schedule.findSchedule(array);
        Assertions.assertArrayEquals(new int[][]{{9, 11}, {11, 13}, {13, 15}}, result);
    }

    @Test
    void test3() {
        int[][] array = new int[][]{{12, 14}};
        var result = schedule.findSchedule(array);
        Assertions.assertArrayEquals(new int[][]{{12, 14}}, result);
    }

    @Test
    void test4() {
        int[][] array = new int[][]{};
        var result = schedule.findSchedule(array);
        Assertions.assertArrayEquals(new int[][]{}, result);
    }
}