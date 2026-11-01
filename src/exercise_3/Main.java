package exercise_3;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.setOperands(100,45);

        System.out.println(calc.add());
        System.out.println(calc.sub());
        System.out.println(calc.mul());
        System.out.println(calc.div());
    }
}
