package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class LetterCombinationsPhoneNumberTest {
    LetterCombinationsPhoneNumber letterCombinationsPhoneNumber;

    @BeforeEach
    void setUp() {
        letterCombinationsPhoneNumber = new LetterCombinationsPhoneNumber();
    }

    @Test
    void test1() {

        List<String> result = letterCombinationsPhoneNumber.letterCombinations("23");
        Assertions.assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result);
    }

    @Test
    void test2() {

        List<String> result = letterCombinationsPhoneNumber.letterCombinations("2");
        Assertions.assertEquals(List.of("a","b","c"), result);
    }
}