package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class LetterCombinationsPhoneNumberV2Test {
    private LetterCombinationsPhoneNumberV2 letterCombinationsPhoneNumberV2;

    @BeforeEach
    void setUp() {
        letterCombinationsPhoneNumberV2 = new LetterCombinationsPhoneNumberV2();
    }

    @Test
    void test1() {

        List<String> result = letterCombinationsPhoneNumberV2.letterCombinations("23");
        Assertions.assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result);
    }

    @Test
    void test2() {

        List<String> result = letterCombinationsPhoneNumberV2.letterCombinations("2");
        Assertions.assertEquals(List.of("a", "b", "c"), result);
    }
}