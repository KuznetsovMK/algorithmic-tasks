package grokking_algorithms.chapter_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingByChoice {

    public int[] sort(int[] array) {
        int[] result = new int[array.length];

        List<Integer> list = toList(array);
        int index = 0;

        while (!list.isEmpty()) {
            int smallerIndex = findSmallerIndex(list);
            Integer value = list.get(smallerIndex);
            result[index] = value;
            list.remove(smallerIndex);

            index++;
        }

        return result;
    }

    public int[] sortReversOrder(int[] array) {
        int[] result = new int[array.length];

        List<Integer> list = toList(array);
        int index = 0;

        while (!list.isEmpty()) {
            int higherIndex = findHigherIndex(list);
            Integer value = list.get(higherIndex);
            result[index] = value;
            list.remove(higherIndex);

            index++;
        }

        return result;
    }

    public List<Integer> sort(List<Integer> ints) {
        List<Integer> mutable = new ArrayList<>(ints);
        List<Integer> result = new ArrayList<>();

        while (!mutable.isEmpty()) {
            int smallerIndex = findSmallerIndex(mutable);
            Integer smaller = mutable.get(smallerIndex);
            result.add(smaller);
            mutable.remove(smallerIndex);
        }

        return result;
    }

    private List<Integer> toList(int[] ints) {
        return new ArrayList<>(
                Arrays
                        .stream(ints)
                        .boxed()
                        .toList()
        );
    }

    private int findSmallerIndex(List<Integer> ints) {
        int index = 0;
        int smaller = ints.get(0);

        for (int i = 1; i < ints.size(); i++) {
            if (ints.get(i) < smaller) {
                smaller = ints.get(i);
                index = i;
            }
        }

        return index;
    }

    private int findHigherIndex(List<Integer> ints) {
        int index = 0;
        int higher = ints.get(0);

        for (int i = 1; i < ints.size(); i++) {
            if (ints.get(i) > higher) {
                higher = ints.get(i);
                index = i;
            }
        }

        return index;
    }
}
