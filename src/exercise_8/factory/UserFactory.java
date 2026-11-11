package exercise_8.factory;

public class UserFactory {
    public static User newUser(String userType, String username){

        User user = switch (userType) {
            case "viewer" -> new Viewer(username);
            case "admin" -> new Admin(username);
            case "superuser" -> new Superuser(username);
            default -> null;
        };
        return user;
    }

    User user1 = UserFactory.newUser("admin","John");
    User user2 = UserFactory.newUser("viewer", "Ben");
    User user3 = UserFactory.newUser("superuser", "Tom");

}
