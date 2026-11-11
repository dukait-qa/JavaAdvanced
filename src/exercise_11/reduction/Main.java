package exercise_11.reduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Stream<Integer> numbersStream = numbers.stream();
        Integer reduced = numbersStream.reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(reduced);
    }
}
