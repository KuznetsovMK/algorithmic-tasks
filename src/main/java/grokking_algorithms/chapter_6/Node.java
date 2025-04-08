package grokking_algorithms.chapter_6;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Node {
    private String name;
    private List<Node> nodes;

    public static Node of(String name) {
        Node node = new Node();
        node.setName(name);
        return node;
    }
}
