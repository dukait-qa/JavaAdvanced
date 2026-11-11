package exercise_5;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class JavaProgram {
    public static void main(String[] args) {

        int[] numbers = {13,8,-9,15,-1,-78,5,69};

        numbers = Arrays.stream(numbers).filter(value -> (value > 0)).toArray();

        System.out.println(Arrays.toString(numbers));

    }
}
