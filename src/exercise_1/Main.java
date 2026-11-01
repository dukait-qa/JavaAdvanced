public class Main {
    public static void main(String[] args) {

        Product product = new Product("Logitech", "F710", 129.99);
        Product product1 = new Product("HP", "Envy Photo 7155", 100.00);
        Product product2 = new Product("Dell", "U2419H", 219.99);

        System.out.println("=== PRODUCT ===");
        System.out.println("1st * " + product);
        System.out.println("2nd * " + product1);
        System.out.println("3rd * " + product2);

        Monitor monitor = new Monitor("Philips", "243v7q", 1050, 20.5);
        Monitor monitor1 = new Monitor("HP", "M22f", 1500, 21.5);
        Monitor monitor2 = new Monitor("Acer", "G237HL", 1000, 23.0);

        System.out.println("=== MONITOR ===");
        System.out.println("1st * " + monitor);
        System.out.println("2nd * " + monitor1);
        System.out.println("3rd * " + monitor2);

        Printer printer = new Printer("HP", "790", 1000, true);
        Printer printer1 = new Printer("HP", "G237HL", 500, false);
        Printer printer2 = new Printer("Acer", "G23F", 1400, true);

        System.out.println("=== PRINTER ===");
        System.out.println("1st * " + printer);
        System.out.println("2nd * " + printer1);
        System.out.println("3rd * " + printer2);

        Gamepad gamepad = new Gamepad("Logitech", "F310", 199, true);
        Gamepad gamepad1 = new Gamepad("PlayStation", "5", 1999, true);
        Gamepad gamepad2 = new Gamepad("Microsoft", "xbox", 1000, true);

        System.out.println("=== GAMEPAD ===");
        System.out.println("1st * " + gamepad);
        System.out.println("2nd * " + gamepad1);
        System.out.println("3rd * " + gamepad2);
    }
}
