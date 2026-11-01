public class Sandwich extends Product{
    public Sandwich(String name, double price) {
        super(name, price);
    }
    public double countPrice() {
        return this.price + this.price * 0.15 ;
    }
}
