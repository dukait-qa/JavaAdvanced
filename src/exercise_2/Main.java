package exercise_2;

public class Main {
    public static void main(String[] args) {

        Square s = new Square();
        s.setValues(100,100,5);

        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
