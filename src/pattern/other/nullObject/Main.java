package pattern.other.nullObject;

public class Main {
    public static void main(String[] args) {
        User user1 = UserFactory.getUser("Alice", true);
        User user2 = UserFactory.getUser(null, false);
        System.out.println("User 1:" + user1.getName() + ",hasAccess:" + user1.hasAccess());
        System.out.println("User 2:" + user2.getName() + ",hasAccess:" + user2.hasAccess());
    }
}
