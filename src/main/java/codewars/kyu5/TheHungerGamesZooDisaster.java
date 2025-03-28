package codewars.kyu5;

import java.util.*;
import java.util.stream.Collectors;

/**
 * antelope eats grass
 * big-fish eats little-fish
 * bug eats leaves
 * bear eats big-fish
 * bear eats bug
 * bear eats chicken
 * bear eats cow
 * bear eats leaves
 * bear eats sheep
 * chicken eats bug
 * cow eats grass
 * fox eats chicken
 * fox eats sheep
 * giraffe eats leaves
 * lion eats antelope
 * lion eats cow
 * panda eats leaves
 * sheep eats grass
 */

public class TheHungerGamesZooDisaster {

    public static void main(String[] args) {


        String zoo = "fox,bug,chicken,grass,sheep";
        System.out.println(Arrays.toString(whoEatsWho(zoo)));


    }

    public static String[] whoEatsWho(final String zoo) {


        String str = " antelope eats grass\n" +
                " big-fish eats little-fish\n" +
                " bug eats leaves\n" +
                " bear eats big-fish\n" +
                " bear eats bug\n" +
                " bear eats chicken\n" +
                " bear eats cow\n" +
                " bear eats leaves\n" +
                " bear eats sheep\n" +
                " chicken eats bug\n" +
                " cow eats grass\n" +
                " fox eats chicken\n" +
                " fox eats sheep\n" +
                " giraffe eats leaves\n" +
                " lion eats antelope\n" +
                " lion eats cow\n" +
                " panda eats leaves\n" +
                " sheep eats grass";

        Collection<String> strings = Arrays.asList(str.split("\n"));
        Map<String, List<String>> map = strings.stream()
                .collect(Collectors
                        .groupingBy((p) -> p.split(" ")[1],
                                Collectors.mapping((p) -> p.split(" ")[3],
                                        Collectors.toList())));

        String[] animals = zoo.split(",");

        int cnt = animals.length;

        while (cnt >= 0) {

            for (int i = 0; i < animals.length; i++) {
                if (map.get(animals[i]) != null) {
                    List<String> animalEats = map.get(animals[i]);
                    List<String> arrList = new ArrayList<>(Arrays.asList(animals));
                    if ((i - 1 >= 0) && animalEats.contains(animals[i - 1])) {
                        arrList.remove(i - 1);
                        animals = arrList.toArray(new String[0]);
                        break;
                    }
                    if ((i + 1 < animals.length) && animalEats.contains(animals[i + 1])) {
                        arrList.remove(i + 1);
                        animals = arrList.toArray(new String[0]);
                        break;
                    }
                }
            }
            cnt--;
        }
        return animals;
    }
}
