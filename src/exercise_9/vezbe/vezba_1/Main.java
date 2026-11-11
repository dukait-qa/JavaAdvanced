package exercise_9.vezbe.vezba_1;

import java.util.ArrayList;

/**
 * Potrebno je sve korisnike iz kolekcije usersToAdd dodati u kolekciju users.
 * Ukoliko korisnik koji se dodaje već postoji unutar kolekcije, potrebno ga je prepisati preko postojećeg.
 * Za poređenje korisnika je potrebno koristiti id vrednosti.
 * Na kraju je potrebno prikazati sve elemente kolekcije users.
 */

public class Main {
    public static void main(String[] args) {

        ArrayList usersToAdd = new ArrayList();
        usersToAdd.add(new User(3, "Ben2"));
        usersToAdd.add(new User(4, "John"));
        usersToAdd.add(new User(5, "Daniel"));

        ArrayList users = new ArrayList();
        users.add(new User(1, "Sem"));
        users.add(new User(2, "Tom"));
        users.add(new User(3, "Ben"));


        for (int i = 0; i < usersToAdd.size(); i++) {
            boolean userExists = false;
            for (int u = 0; u < users.size(); u++)
                if (((User) users.get(u)).id == ((User) usersToAdd.get(i)).id) {

                    users.set(u, (User) usersToAdd.get(i));

                    userExists = true;
                }
            if (!userExists)
                users.add(usersToAdd.get(i));
            else
                userExists = false;
        }

        for (Object o : users) {
            User u = (User) o;
            System.out.println(u.id + ": " + u.name);
        }
    }
}
