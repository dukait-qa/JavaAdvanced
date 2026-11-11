package exercise_1;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Product product = new Product("Logitech", "F710", 129.99) {
            @Override
            public double countPrice() {
                return 0;
            }

            @Override
            public int checkStock() {
                return 0;
            }
        };
        Product product1 = new Product("HP", "Envy Photo 7155", 100.00) {
            @Override
            public double countPrice() {
                return 0;
            }

            @Override
            public int checkStock() {
                return 0;
            }
        };
        Product product2 = new Product("Dell", "U2419H", 219.99) {
            @Override
            public double countPrice() {
                return 0;
            }

            @Override
            public int checkStock() {
                return 0;
            }
        };

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

        // Reflection

        Class stringClass = String.class;
        String className = stringClass.getName();
        String simpleClassName = stringClass.getSimpleName();
        int modifiers = stringClass.getModifiers();
        Package classPackage = stringClass.getPackage();
        Class superclass = stringClass.getSuperclass();

        System.out.println(className); // java.lang.String
        System.out.println(simpleClassName); // String
        System.out.println("Is private: " + Modifier.isPrivate(modifiers)); // Is private : False
        System.out.println("Is public: " + Modifier.isPublic(modifiers)); // Is public: True
        System.out.println("Is final: " + Modifier.isFinal(modifiers));// Is final: True
        System.out.println(classPackage.getName()); // java.lang
        System.out.println(superclass.getName());// java.lang.Object

//        Class productClass = Product.class;
//
//        Constructor[] constructors = productClass.getConstructors();
//
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor.getParameterCount());
//            System.out.println(Arrays.toString(constructor.getParameterTypes()));
//        }

        /*
        try {
        Constructor constructor = productClass.getConstructor(String.class, String.class, double.class);
            Product product = (Product) constructor.newInstance("Logitech", "F710", 129.99);
            System.out.println(product);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();

        }
         */

        // Pristup poljima jedne klase

        /*Class productClass = Product.class;
        Field[] fields =  productClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        // samo 1 polje iz neke klase:

        try {
            Field field1 = productClass.getField("brand");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        Product product1 = new Product("Logitech", "F710", 129.99);

        Class productClass = Product.class;

        Field[] fields =  productClass.getDeclaredFields();

        for (Field field : fields) {
            try {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(product1));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } */

        // Postavljanje/izmena vrednosti svojstava

        /*Product product1 = new Product();

        Class productClass = Product.class;

        Field[] fields = productClass.getDeclaredFields();

        for (Field field : fields) {

            field.setAccessible(true);

            if (field.getType() == String.class) {
                if (field.getName().equals("brand")) {
                    field.set(product1, "Logitech");
                } else if (field.getName().equals("model")) {
                    field.set(product1, "F710");
                }
            } else if (field.getType() == double.class) {
                field.set(product1, 129.99);
            }
        }

        System.out.println(product1);

    }*/

        // Metode koje se nalaze unutar klase Product:

        /*Class productClass = Product.class;
        Method[] methods = productClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // Metode koje su deklarisane unutar klase Product:

        Class productClass = Product.class;
        Method[] methods = productClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        } */

        /*Product product1 = new Product("Logitech", "F710", 129.99) {
            @Override
            public double countPrice() {
                return 0;
            }

            @Override
            public int checkStock() {
                return 0;
            }
        };

            // Pozivanje metode toString();

        Class productClass = Product.class;
        Method method = productClass.getMethod("toString");
        String returnValue = (String) method.invoke(product1);

        System.out.println(returnValue);*/



    }
    }