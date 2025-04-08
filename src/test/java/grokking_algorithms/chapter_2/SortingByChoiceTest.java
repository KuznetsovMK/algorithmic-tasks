package grokking_algorithms.chapter_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SortingByChoiceTest {
    private SortingByChoice sortingByChoice;

    @BeforeEach
    void setUp() {
        sortingByChoice = new SortingByChoice();
    }

    @Test
    void test1() {
        List<Integer> result = sortingByChoice.sort(List.of(5, 7, 1, 4, 6, 9, 3, 8, 2, 0));
        Assertions.assertEquals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), result);
    }

    @Test
    void test2() {
        int[] result = sortingByChoice.sort(new int[]{5, 7, 1, 4, 6, 9, 3, 8, 2, 0});
        List<Integer> resultList = Arrays.stream(result).boxed().toList();
        Assertions.assertEquals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), resultList);
    }

    @Test
    void test3() {
        int[] result = sortingByChoice.sortReversOrder(new int[]{5, 7, 1, 4, 6, 9, 3, 8, 2, 0});
        List<Integer> resultList = Arrays.stream(result).boxed().toList();
        Assertions.assertEquals(List.of(9, 8, 7, 6, 5, 4, 3, 2, 1, 0), resultList);
    }
}