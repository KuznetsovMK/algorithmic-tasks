package codewars.kyu5;

import java.util.*;

public class GreedIsGood {

    public static void main(String[] args) {

        int[] arr = new int[]{2,4,4,5,4};
        greedy(arr);
    }

    public static int greedy(int[] dice){

        Map<Integer, List<Integer>> map1 = new HashMap<>();
        map1.put(1, new ArrayList<>(Arrays.asList(100, 1000)));
        map1.put(2, new ArrayList<>(Arrays.asList(0, 200)));
        map1.put(3, new ArrayList<>(Arrays.asList(0, 300)));
        map1.put(4, new ArrayList<>(Arrays.asList(0, 400)));
        map1.put(5, new ArrayList<>(Arrays.asList(50, 500)));
        map1.put(6, new ArrayList<>(Arrays.asList(0, 600)));

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < dice.length; i++) {
            map.put(dice[i], map.containsKey(dice[i]) ? map.get(dice[i]) + 1 : 1);
        }

        int sum = 0;

        for (int i = 1; i < 7; i++) {
            if (map.containsKey(i)) {
                int a = map.get(i) / 3;
                int b = map.get(i) % 3;

                List<Integer> list = new ArrayList<>(map1.get(i));

                 sum = sum + (b * list.get(0) + a * list.get(1));
            }
        }


        return sum;
    }
}
