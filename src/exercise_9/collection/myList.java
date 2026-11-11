package exercise_9.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class myList {
    public static void main(String[] args) {

        // Kolekcije mogu da prihvate podatke razlicitih tipova

        ArrayList myList = new ArrayList();
        myList.add("Honda");
        myList.add(13);
        myList.add("Mercedes");
        myList.add(true);
        myList.add(33.44);

        myList.set(1,"Yugo"); // Izmena elementa u nizu pomocu indeksa

        for (Object o : myList) {
            System.out.println(o);
        }
        System.out.println(myList.contains("Honda")); // provera da li neka vrednosti postoji unutar kolekcija; true/false

        if (myList.contains("Honda")) {
            int elemIndex = myList.indexOf("Honda");
            String elem = (String) myList.get(elemIndex);
            System.out.println(elem);
        }

        Object[] array = myList.toArray();
        for (int i = 0; i < array.length; i++) { // pretvaranje kolekcije (liste) u niz
            System.out.println(array[i]);
        }

        myList.clear(); // brisanje svih elemenata liste

        Iterator iterator = myList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

        }
      }
    }
