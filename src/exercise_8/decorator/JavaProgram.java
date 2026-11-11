package exercise_8.decorator;

public class JavaProgram {
    public static void main(String[] args) {

        RectangleDecorator rd = new RectangleDecorator(new Rectangle(2,3));
        System.out.println(rd.rectangle.area());
        System.out.println(rd.perimeter());
    }
}
