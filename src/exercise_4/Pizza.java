public class Pizza extends Product{
    public Pizza (String name, double price) {
        super(name, price);
    }

    @Override
    public double countPrice() {
        return this.price + this.price * 0.1;
    }
}
