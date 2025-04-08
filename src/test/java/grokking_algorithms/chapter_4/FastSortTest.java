package grokking_algorithms.chapter_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FastSortTest {
    FastSort fastSort = new FastSort();

    @Test
    @DisplayName("find smallest side")
    void test1() {
        int result = fastSort.smallSide(640, 400);
        Assertions.assertEquals(80, result);
    }

    @Test
    @DisplayName("sum all elements of array list")
    void test2() {
        int result = fastSort.sum(new ArrayList<>(List.of(1, 2, 3, 4)));
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("sum all elements of array")
    void test3() {
        int result = fastSort.sum(new int[]{1, 2, 3, 4, 5});
        Assertions.assertEquals(15, result);
    }

    @Test
    @DisplayName("find max value")
    void test4() {
        int result = fastSort.max(new int[]{1, 5, 2, 6, 3, 0, 8, 1});
        Assertions.assertEquals(8, result);
    }

    @Test
    @DisplayName("binary search")
    void test5() {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(128, 7);
        map.put(100, 7);
        map.put(240000, 18);
        map.put(128 * 2, 8);

        map
                .forEach((key, value) -> {
                    int result = fastSort.binarySearch(key);
                    Assertions.assertEquals(value, result);
                });
    }

    @Test
    @DisplayName("quick sort")
    void test6() {
        int[] result = fastSort.qSort(new int[]{5, 3, 1, 2, 4});
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    @DisplayName("quick sort list")
    void test7() {
        List<Integer> result = fastSort.qSort(new ArrayList<>(List.of(5, 3, 1, 2, 4)));
        Assertions.assertEquals(List.of(1, 2, 3, 4, 5), result);
    }
}