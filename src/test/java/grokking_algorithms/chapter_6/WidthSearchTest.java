package grokking_algorithms.chapter_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class WidthSearchTest {
    WidthSearch widthSearch;
    Map<String, List<String>> graph;
    Node start;
    Node end;

    @BeforeEach
    void SetUp() {
        widthSearch = new WidthSearch();
    }

    private void initNode1() {
        start = Node.of("Start");
        Node node1 = Node.of("node1");
        Node node2 = Node.of("node2");
        Node node3 = Node.of("node1");
        Node node4 = Node.of("node4");
        end = Node.of("End");

        start.setNodes(List.of(node1, node2));
        node1.setNodes(List.of(node3, end));
        node2.setNodes(List.of(node3, node4));
        node3.setNodes(List.of());
        node4.setNodes(List.of(end));
    }

    private void initNode2() {
        start = Node.of("CAB");
        Node car = Node.of("CAR");
        Node cat = Node.of("CAT");
        Node mat = Node.of("MAT");
        Node bar = Node.of("BAR");
        end = Node.of("BAT");

        start.setNodes(List.of(cat, car));
        car.setNodes(List.of(cat, bar));
        cat.setNodes(List.of(end, mat));
        mat.setNodes(List.of(end));
        bar.setNodes(List.of(end));
        end.setNodes(List.of());
    }

    private void initGraph() {
        graph = new HashMap<>();

        String start = "CAB";
        String end = "BAT";

        graph.put(start, List.of("CAT", "CAR"));
        graph.put("CAR", List.of("CAT", "BAR"));
        graph.put("CAT", List.of(end, "MAT"));
        graph.put("MAT", List.of(end));
        graph.put("BAR", List.of(end));
        graph.put(end, List.of());
    }

    private void initGraph2() {
        graph = new HashMap<>();

        graph.put("CAB", List.of("BAT"));
        graph.put("BAT", List.of("CAB"));
    }

    @Test
    void test1() {
        initNode1();

        int result = widthSearch.findShortWayByRecursive(new LinkedList<>(start.getNodes()), end.getName());
        Assertions.assertEquals(2, result);
    }

    @Test
    void test3() {
        initNode2();

        int result = widthSearch.findShortWayByRecursive(new LinkedList<>(start.getNodes()), end.getName());
        Assertions.assertEquals(2, result);
    }

    @Test
    void test4() {
        initNode2();

        int result = widthSearch.findShortWayByRecursive(new LinkedList<>(start.getNodes()), "null");
        Assertions.assertEquals(0, result);
    }

    @Test
    void test5() {
        initGraph();

        int result = widthSearch.findShortWay(graph, "CAB", "BAT");
        Assertions.assertEquals(2, result);
    }

    @Test
    void test6() {
        initGraph2();

        int result = widthSearch.findShortWay(graph, "CAB", "BAT");
        Assertions.assertEquals(1, result);
    }
}