package codewars.kyu5;//package codewars.kyu5;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StringIncrementerTest {
//    private static void doTest(String str, String expected) {
//        String actual = assertDoesNotThrow(() -> StringIncrementer.incrementString(str), "Solution thrown an unexpected exception for str=\"" + str + "\"\n\n");
//        assertEquals(expected, actual, "Incorrect answer for str=\"" + str + "\"\n\n");
//    }
//
//
//    @Test
//    public void exampleTests() {
//        doTest("foobar000", "foobar001");
//        doTest("foo", "foo1");
//        doTest("foobar001", "foobar002");
//        doTest("foobar99", "foobar100");
//        doTest("foobar099", "foobar100");
//        doTest("", "1");
//        doTest("1", "2");
//        doTest("K?>V0%8fR*72827444566079629679283864581228", "K?>V0%8fR*72827444566079629679283864581229");
//    }
//}