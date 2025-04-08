package grokking_algorithms.chapter_1;

public class BinarySearch {

    public int lb(int a) {
        int count = 0;

        while (a > 1) {
            a >>= 1;
            if (a > 1 && isOdd(a)) a++;

            count++;
        }

        return count;
    }

    private boolean isOdd(int a) {
        return (a & 1) == 1;
    }
}
