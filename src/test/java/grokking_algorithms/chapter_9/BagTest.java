package grokking_algorithms.chapter_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BagTest {
    Bag bag = new Bag();

    @Test
    void test1() {
        int result = bag.findMaxCost(List.of(cd(), notebook(), guitar()), 4);
        Assertions.assertEquals(3500, result);
    }

    @Test
    void test2() {
        int result = bag.findMaxCost(List.of(cd(), notebook(), guitar(), iPhone()), 4);
        Assertions.assertEquals(4000, result);
    }

    @Test
    void test3() {
        int result = bag.findMaxCost(List.of(cd(), notebook(), guitar(), iPhone()), 1);
        Assertions.assertEquals(2000, result);
    }

    @Test
    void test4() {
        int result = bag.findMaxCost(List.of(), 1);
        Assertions.assertEquals(0, result);
    }

    @Test
    void test5() {
        int result = bag.findMaxCost(List.of(cd(), notebook(), guitar(), iPhone()), 0);
        Assertions.assertEquals(0, result);
    }

    private Product cd() {
        return Product.builder()
                .name("cd")
                .weight(4)
                .cost(3000)
                .build();
    }

    private Product notebook() {
        return Product.builder()
                .name("notebook")
                .weight(3)
                .cost(2000)
                .build();
    }

    private Product guitar() {
        return Product.builder()
                .name("guitar")
                .weight(1)
                .cost(1500)
                .build();
    }

    private Product iPhone() {
        return Product.builder()
                .name("iPhone")
                .weight(1)
                .cost(2000)
                .build();
    }
}