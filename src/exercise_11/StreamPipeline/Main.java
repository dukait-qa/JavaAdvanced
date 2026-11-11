package exercise_11.StreamPipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, -2, 0, 22, 98, -434, -89, -66, 123, 22, 98, 0);
        Stream<Integer> numbersStream = numbers.stream();

        ArrayList<Integer> numbersFiltrated = numbersStream.filter(num -> num > 0).distinct().sorted().collect(Collectors.toCollection(ArrayList::new));

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\n");

        for (Integer num : numbersFiltrated) {
            System.out.print(num + " ");
        }
    }
}
