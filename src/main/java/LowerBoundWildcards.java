package main.java;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildcards {

    public static void main(String[] args) {
        // ? wildcards
        // Unbounded wildcards
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList(1, 2);
        List<Object> list4 = Arrays.asList(1, 2);

        printNumbers(list2);
        printNumbers(list3);
        printNumbers(list4);
    }

    //Upper bounded wildcards
    static void printNumbers(List<? super Integer> list) {
        list.forEach(
                e -> {
                    System.out.println(e.getClass());
                    System.out.println(e);
                }
        );
    }
}
