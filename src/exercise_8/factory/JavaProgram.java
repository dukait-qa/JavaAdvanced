package exercise_8.factory;

public class JavaProgram {
    public static void main(String[] args) {

        User user1 = UserFactory.newUser("admin", "John");
        User user2 = UserFactory.newUser("viewer", "Ben");
        User user3 = UserFactory.newUser("superuser", "Tom");
    }
}
