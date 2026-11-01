package exercise_2;

public class Square extends Quad implements Geom{


    @Override
    public int area() {
        return a * a;
    }

    @Override
    public int perimeter() {
        return 4 * this.a;
    }

    @Override
    public void setValues(int x, int y, int a) {
        this.x = x;
        this.y = y;
        this.a = a;
    }
}
