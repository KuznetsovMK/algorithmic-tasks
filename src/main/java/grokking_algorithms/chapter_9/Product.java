package grokking_algorithms.chapter_9;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private String name;
    private Integer weight;
    private Integer cost;
}
