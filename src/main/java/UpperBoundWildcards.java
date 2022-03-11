package main.java;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcards {
    public static void main(String[] args) {
        // ? wildcards
        // Unbounded wildcards
        List<Double> list1 = Arrays.asList(1.0, 2.0);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList(1, 2);

        printNumbers(list1);
        printNumbers(list2);
    }

    //Upper bounded wildcards
        static void printNumbers(List<? extends Number> list) {
            list.forEach(
                    e -> {
                        System.out.println(e.getClass());
                        System.out.println(e);
                    }
            );
        }
}
