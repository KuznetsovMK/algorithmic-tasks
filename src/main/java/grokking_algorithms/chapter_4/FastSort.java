package grokking_algorithms.chapter_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FastSort {

    public int smallSide(int a, int b) {
        int bigSide = Math.max(a, b);
        int smallSide = Math.min(a, b);

        if (bigSide % smallSide == 0) {
            return smallSide;
        } else {
            int mod = bigSide % smallSide;
            return smallSide(smallSide, mod);
        }
    }

    public int sum(List<Integer> list) {
        if (list.isEmpty()) return 0;
        return list.get(0) + sum(list.subList(1, list.size()));
    }

    public int sum(int[] array) {
        if (array.length == 1) return array[0];
        return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
    }

    public int max(int[] array) {
        if (array.length == 1) return array[0];

        int max = max(Arrays.copyOfRange(array, 1, array.length));
        return Math.max(array[0], max);
    }

    public int binarySearch(int a) {
        if (a == 1) return 0;

        a >>= 1;
        if (a > 1 && isOdd(a)) a++;

        return 1 + binarySearch(a);
    }

    private boolean isOdd(int a) {
        return (a & 1) == 1;
    }

    public int[] qSort(int[] array) {
        if (array.length < 2) return array;

        int pivot = array[0];
        int[] less = new int[array.length];
        int[] greater = new int[array.length];
        int lesCount = 0;
        int greatCount = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= pivot) {
                less[lesCount] = array[i];
                lesCount++;
            } else {
                greater[greatCount] = array[i];
                greatCount++;
            }
        }

        less = Arrays.copyOf(less, lesCount);
        greater = Arrays.copyOf(greater, greatCount);

        return merge(qSort(less), pivot, qSort(greater));
    }

    private int[] merge(int[] a, int pivot, int[] b) {
        int[] result = new int[a.length + b.length + 1];
        int index = 0;

        for (int i : a) {
            result[index++] = i;
        }

        result[index++] = pivot;

        for (int i : b) {
            result[index++] = i;
        }

        return result;
    }

    public List<Integer> qSort(List<Integer> list) {
        if (list.size() < 2) return list;

        List<Integer> less = new ArrayList<>();
        List<Integer> great = new ArrayList<>();

        Integer pivot = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (pivot >= list.get(i)) {
                less.add(list.get(i));
            } else {
                great.add(list.get(i));
            }
        }

        return merge(qSort(less), pivot, qSort(great));
    }

    private List<Integer> merge(List<Integer> a, Integer pivot, List<Integer> b) {
        List<Integer> result = new ArrayList<>(a);
        result.add(pivot);
        result.addAll(b);

        return result;
    }
}
