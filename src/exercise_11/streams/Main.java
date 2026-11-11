package exercise_11.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {13, 6, -1, 22, -42, 44, 55};

        // Svi brojevi manji od 0 su uklonjeni iz liste

        numbers = Arrays.stream(numbers).filter(value -> (value > 0)).toArray();
        System.out.println(Arrays.toString(numbers));


        // Kreiranje praznog toka:

        Stream<String> emptyStream = Stream.empty();

        // Kreiranje toka na osnovu niza:

        String[] cars = {"Honda", "Toyota", "Mercedes", "BMW"};
        Stream<String> carsStream = Arrays.stream(cars);

        // Kreiranje toka na osnovu kolekcija:

        ArrayList<String> cars1 = new ArrayList<>();
        cars1.add("Honda");
        cars1.add("Toyota");
        cars1.add("Mercedes");
        cars1.add("BMW");

        Stream<String> cars1Stream = cars1.stream();

        // HashMap

        HashMap<Integer, String> cars2 = new HashMap<>();

        cars2.put(1, "Honda");
        cars2.put(2, "Toyota");
        cars2.put(3, "Mercedes");
        cars2.put(4, "BMW");

        Stream<String> carBrandsStream = cars2.values().stream();
        //and
        Stream<Integer> carKeysStream = cars2.keySet().stream();

        // Kreitanje toka koriscenjem Stream.builder() metodu:

        Stream<String> carStream = Stream.<String>builder().add("Honda").add("Toyota").add("Mercedes").add("BMW").build();

        // Kreiranje toka koriscenjem metode Stream.generate();

        Stream<String> streamGenerated = Stream.generate(() -> "elem").limit(8);

        // Kreiranje toka koriscenjem metode Stream.iterate();

        Stream<Integer> streamGenerate = Stream.iterate(0, n -> n + 1).limit(13);

        // Kreiranje tokova prostih podataka, koriscenjem IntStream interfejsa:

        int[] numbers2 = {1, -2, 0, 22, 98, -434, -89, -66, 123};
        IntStream numbers2Stream = Arrays.stream(numbers2);

        // Prolazak kroz tok metodom forEach():

        String[] cars3 = {"Honda", "Toyota", "Mercedes", "BMW"};
        Stream<String> cars3Stream = Arrays.stream(cars3);
        cars3Stream.forEach(System.out::println); // it is ok.
        // cars3Stream.forEach(System.out::println); it is error = nije moguce proci 2 puta kroz tok

        // Referenca na metodu:

        String[] cars4 = {"Honda", "Fiat", "Opel", "Toyota", "Mercedes", "BMW"};
        Stream<String> cars4Stream = Arrays.stream(cars4);
        cars4Stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // Transformacija vrednosti pomocu metode forEach():

        String[] cars5 = {"Honda", "Toyota", "Mercedes", "BMW"};
        Stream<String> cars5Stream = Arrays.stream(cars5);
        cars5Stream.forEach(s -> {
            System.out.println("Car brand: " + s);
        });










    }
}
