package grokking_algorithms.chapter_3;

public class Recursion {

    public long findFactorial(int i) {
        if (i == 1) return i;
        return i * findFactorial(i - 1);
    }
}
