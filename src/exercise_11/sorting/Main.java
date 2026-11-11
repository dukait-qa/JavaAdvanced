package exercise_11.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Podrazumevano sotriranje nize ka vecem:
 *ArrayList<Integer> numbersFiltrated = numbersStream.sorted().collect(Collectors.toCollection(ArrayList::new));
 *
 * Sotriranje od veceg ka nizeg:
 * ArrayList<Integer> numbersFiltrated = numbersStream.sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
 *
 */

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, -2, 0, 22, 98, -434, -89, -66, 123);
        Stream<Integer> numbersStream = numbers.stream();

        ArrayList<Integer> numbersFiltrated = numbersStream.sorted().collect(Collectors.toCollection(ArrayList::new));

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\n");

        for (Integer num : numbersFiltrated) {
            System.out.print(num + " ");
        }



    }
}
