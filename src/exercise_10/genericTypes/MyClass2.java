package exercise_10.genericTypes;

public class MyClass2<T extends Number> {
    public T t;

    public void showResult() {
        if(t.getClass().equals(Integer.class))
            System.out.println(t.intValue() * t.intValue());
        if(t.getClass().equals(Double.class))
            System.out.println(t.doubleValue() * t.doubleValue());

    }

    static <T> void showInfo(T value) {
        System.out.println(value.getClass().getSimpleName() + " = " + value);
    }
}
