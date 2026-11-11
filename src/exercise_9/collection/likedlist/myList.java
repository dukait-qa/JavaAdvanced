package exercise_9.collection.likedlist;

import java.util.LinkedList;

public class myList {
    public static void main(String[] args) {

    LinkedList myList = new LinkedList();
    myList.add("Honda");
    myList.add("Ford");
    myList.add("Toyota");
    myList.add("Mercedes");

        System.out.println(myList.peek()); // cita element sa vrha
        System.out.println(myList.poll()); // cita i uklanja element sa vrha
        System.out.println(myList.poll());

        System.out.println(myList.size());

    }
}
