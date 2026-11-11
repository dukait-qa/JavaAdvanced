package exercise_9.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class myCollection {
    public static void main(String[] args) {

        HashSet myCollection = new HashSet();
        myCollection.add("One");
        myCollection.add("Two");
        myCollection.add("Three");
        myCollection.add("Four");
        myCollection.add("Five");
        myCollection.add("One");

        Iterator<String> i = myCollection.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
