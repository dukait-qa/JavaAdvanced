package exercise_1;

public class Printer extends Product{
    boolean color;
    public Printer(String brand, String model, double price, boolean color ) {
        super(brand, model, price);
        this.color = color;
    }

    @Override
    public double countPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " color = " + color;
    }

    @Override
    public int checkStock() {
        return 0;
    }
}
