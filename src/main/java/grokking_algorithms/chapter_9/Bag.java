package grokking_algorithms.chapter_9;

import java.util.List;

public class Bag {
    private int[][] table;
    private int[] array;
    private int[] upper;
    private Product product;

    public int findMaxCost(List<Product> products, int bagSize) {
        if (products.isEmpty() || bagSize == 0) return 0;

        table = new int[products.size()][bagSize];

        for (int i = 0; i < products.size(); i++) {
            product = products.get(i);
            if (i == 0) execute();
            else execute(i);
        }

        return table[products.size() - 1][bagSize - 1];
    }

    private void execute() {
        int[] array = table[0];

        for (int i = 0; i < array.length; i++) {
            if (product.getWeight() <= i + 1) array[i] = product.getCost();
        }
    }

    private void execute(int index) {
        upper = table[index - 1];
        array = table[index];

        for (int i = 0; i < array.length; i++) {
            if (isEquals(i)) executeEquals(i);
            else if (isHeight(i)) executeHeight(i);
            else executeLess(i);
        }
    }

    private boolean isEquals(int i) {
        return product.getWeight() == i + 1;
    }

    private void executeEquals(int i) {
        array[i] = Math.max(product.getCost(), upper[i]);
    }

    private boolean isHeight(int i) {
        return product.getWeight() > i + 1;
    }

    private void executeHeight(int i) {
        array[i] = upper[i];
    }

    private void executeLess(int i) {
        array[i] = Math.max(
                upper[i - product.getWeight()] + product.getCost(),
                upper[i]);
    }
}
