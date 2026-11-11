package exercise_1;

public class Gamepad  extends Product implements Storable{
    boolean wireless;
    public Gamepad(String brand, String model, int price, boolean wireless) {
        super(brand, model, price);
        this.wireless = wireless;
    }

    @Override
    public double countPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " wireless = " + wireless;
    }

    @Override
    public int checkStock() {
        return 0;
    }

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public boolean exists() {
        return false;
    }
}
