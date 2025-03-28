package codewars.kyu5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 16, 16, 6, 5, -5, 9, 10, -1, 12, 4, 5, 2, 4, 12, 6, 3, -5, 9, -4, 15, 14, 0, 5};
        getPeaks(arr);

    }

    public static Map<String, List<Integer>> getPeaks(int[] arr) {

        List<Integer> listPos = new ArrayList<>();
        List<Integer> listVal = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>() {{
            put("peaks", listVal);
            put("pos", listPos);
        }};

        String str = "";
        String temp = "";

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) str = "up";
            if (arr[i] < arr[i - 1]) str = "down";
            if (arr[i] == arr[i - 1]) str = "plateau";

            if (str.equals("down") && temp.equals("up")) {
                map = addResult(map, listPos, listVal, arr, i - 1);
            }
            if (str.equals("down") && temp.equals("plateau")) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] != arr[i - 1]) {
                        if (arr[j] < arr[i - 1]) {
                        map = addResult(map, listPos, listVal, arr, j + 1);
                        }
                        break;
                    }
                }
            }
            temp = str;
        }
        return map;
    }

    public static Map<String, List<Integer>> addResult(Map<String, List<Integer>> map, List<Integer> listPos, List<Integer> listVal, int[] arr, int k) {
        listVal.add(arr[k]);
        listPos.add(k);
        map.put("peaks", listVal);
        map.put("pos", listPos);
        return map;
    }
}
