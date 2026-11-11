package exercise_9.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaProgram {
    public static void main(String[] args) {

    // Koriscenjem nizova:

    /*static String[] carBrands = {"Honda", "Toyota", "BMW", "Mercedes"};

        System.out.println(Arrays.toString(carBrands));
        addNewBrand("Nissan");
        System.out.println(Arrays.toString(carBrands));
    }

    public static void addNewBrand(String brand) {
        String[] newCarBrands = new String[carBrands.length + 1];
        System.arraycopy(carBrands, 0, newCarBrands, 0, carBrands.length);
        newCarBrands[carBrands.length] = brand;
        carBrands = newCarBrands;
    }*/

    // Koriscenjem kolekcija:

    ArrayList carBrands = new ArrayList() {
        {
            add("Honda");
            add("Toyota");
            add("Mercedes");
            add("BMW");
        }
    };
        carBrands.set(1,"Mazda"); // Za izmenu odredjenog clana niza pomocu indeksa
        carBrands.set(3, "Zastava");

        System.out.println(carBrands);
        carBrands.add("Fiat"); // dodavanje novog clana u nizu
        System.out.println(carBrands);
        System.out.println(carBrands.get(0)); // citanje odredjenog clana iz niza
        System.out.println(carBrands.get(1));
        System.out.println(carBrands.get(2));
        System.out.println(carBrands.get(3));

        carBrands.remove(0);// brisanje odredjenog clana iz niza pomocu indeksa
        carBrands.remove("Mazda"); // brisanje odredjenog clana iz niza pomocu naziva
        System.out.println(carBrands);

        for (int i = 0; i < carBrands.size(); i++) { // Prolazak kroz kompletnu kolekciju koriscenjem for petlje
            System.out.println(carBrands.get(i));
        }

        for (Object carBrand : carBrands) { // iteracija kolekcija, unapredjena for petlja
            System.out.println(carBrand);
        }

        Iterator itr = carBrands.iterator();
        while (itr.hasNext()) {  // Prolazak kroz kolekciju koriscenjem funkcionalnosti Iterator interfejsa
            System.out.println(itr.next());
        }


    }
}
