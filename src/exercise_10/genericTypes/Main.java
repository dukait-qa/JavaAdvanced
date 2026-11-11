package exercise_10.genericTypes;

public class Main {
    public static void main(String[] args) {


        MyClass<String, Boolean, Integer> myClass1 = new MyClass<>("MyText", true, 32);
        System.out.println(myClass1.t + " " + myClass1.s + " " + myClass1.u);

        MyClass<Integer, Integer, Integer> myClass2 = new MyClass<>(35, 15, 22);
        System.out.println(myClass2.t + " " + myClass2.s + " " + myClass2.u);

        System.out.println(myClass1.getClass().equals(myClass2.getClass()));
        System.out.println(myClass1.equals(myClass2));

    }
}
