package grokking_algorithms.chapter_6;

import java.util.*;
import java.util.stream.Collectors;

public class WidthSearch {
    private final Map<String, List<String>> graph = new HashMap<>();
    private final Queue<String> follow = new LinkedList<>();
    private final Queue<String> main = new LinkedList<>();
    private final Set<String> executed = new HashSet<>();
    private int counter = 0;
    private String end;

    public int findShortWay(Map<String, List<String>> graph, String start, String end) {
        this.graph.putAll(graph);
        this.end = end;
        main.add(start);

        while (!main.isEmpty() || !follow.isEmpty()) {
            if (hasEnd(main, follow)) return counter;
            if (hasEnd(follow, main)) return counter;
        }

        return 0;
    }

    private boolean hasEnd(Queue<String> queue1, Queue<String> queue2) {
        while (!queue1.isEmpty()) {
            String name = queue1.poll();
            if (end.equals(name)) {
                return true;
            }

            if (isValid(name)) {
                queue2.addAll(graph.getOrDefault(name, List.of()));
            }
        }

        counter++;
        return false;
    }

    private boolean isValid(String name) {
        return executed.add(name);
    }

    public int findShortWayByRecursive(Queue<Node> nodes, String end) {
        if (nodes.isEmpty()) return 0;
        Queue<Node> queue = new LinkedList<>();

        while (!nodes.isEmpty()) {
            Node node = nodes.poll();
            if (end.equals(node.getName())) {
                return 1;
            }

            if (isValid(node.getName())) {
                queue.addAll(node.getNodes());
            }

        }

        int result = findShortWayByRecursive(queue, end);
        if (result == 0) {
            return 0;
        } else {
            return ++result;
        }
    }
}
