package exercise_9.collection.stack;

import java.util.Stack;

public class List {
    public static void main(String[] args) {

        /*
         LIFO - Last In First Out;
         Poslednje upisan element prvi je procitan metodom pop();
         */

        Stack List = new Stack();
        List.push("Honda");
        List.push("Mercedes");
        List.push("Fiat");
        List.push("Ford");
        List.push("BMW");

        System.out.println(List.pop());
        System.out.println(List.pop()); // pored isporuke elementa obavlja i njegovo brisanje

        System.out.println(List.size());
    }
}
