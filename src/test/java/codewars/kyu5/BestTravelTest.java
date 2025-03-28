package codewars.kyu5;//package codewars.kyu5;
//
//
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;
//
//
//public class BestTravelTest {
//
//    @Test
//    public void chooseBestSum() {
//        System.out.println("****** Basic Tests small numbers******");
//        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
//        int n = BestTravel.chooseBestSum(163, 3, ts);
//        assertEquals(163, n);
//        ts = new ArrayList<>(Arrays.asList(50));
//        Integer m = BestTravel.chooseBestSum(163, 3, ts);
//        assertNull(m);
//        ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
//        n = BestTravel.chooseBestSum(230, 3, ts);
//        assertEquals(228, n);
//    }
//}