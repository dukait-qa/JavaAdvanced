package exercise_9.vezbe.vezba_2;

import java.util.ArrayList;

/**
 * Potrebno je sotrirati korisnike po id.
 * Emitovati listu na izlazu.
 */

public class Main {
    public static void main(String[] args) {

        ArrayList users = new ArrayList();
        users.add(new User(4, "Alex"));
        users.add(new User(5, "Bob"));
        users.add(new User(6, "Carl"));
        users.add(new User(1, "Peter"));
        users.add(new User(2, "David"));
        users.add(new User(3, "John"));

        int min;
        User tmp;

        for (int i = 0; i < users.size(); i++) {
            min = i;
            for (int u = i; u < users.size(); u++)


                if (((User) users.get(u)).id < ((User) users.get(min)).id)
                    min = u;


            tmp = (User) users.get(min);
            users.set(min, (User) users.get(i));
            users.set(i, tmp);
        }

        for (Object o : users) {
            User u = (User) o;
            System.out.println(u.id + ": " + u.name);
        }
    }
}
