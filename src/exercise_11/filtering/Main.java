package exercise_11.filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, -2, 0, 22, 98, -434, -89, -66, 123);
        Stream<Integer> numbersStream = numbers.stream();
        //numbersStream.filter(value -> (value > 0));

        // upotreba metode collect() u filtriranju:

        ArrayList<Integer> numbersFiltrated = numbersStream.filter(value -> (value > 0)).collect(Collectors.toCollection(ArrayList::new));

        for(Integer num : numbers) {
            System.out.println(num + " ");
        }

        System.out.print("\n");

        for (Integer num : numbersFiltrated) {
            System.out.println(num + " ");
        }
    }
}
