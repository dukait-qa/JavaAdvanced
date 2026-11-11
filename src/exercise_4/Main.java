package exercise_4;

public class Main {
    public static void main(String[] args) {

        Pizza p = new Pizza("Capricciosa", 25);
        p.addSpice("tomato");
        p.addSpice("sour cream");

        Sandwich s = new Sandwich("Sandwich with ham", 35);
        s.addSpice("cucumber");
        s.addSpice("onion");
        s.addSpice("tomato");

        System.out.println(p);
        System.out.println(s);
    }
}
