package main.java;

public class BoundedTypeParameters {
    public static void main(String[] args) {
        Double[] numbers = {1.0, 2.0, 3.0};
        System.out.println(countGreaterThan(numbers, 8.0));

        Integer[] numbers2 = {1, 20, 3};
        System.out.println(countGreaterThan(numbers2, 0));
    }

    interface A {}

    interface B {}
            //<T extends Comparable<T> & A>
    static <T extends Comparable<T>, E extends Comparable> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
