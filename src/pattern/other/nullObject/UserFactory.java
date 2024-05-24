package pattern.other.nullObject;

public class UserFactory {
    public static User getUser(String name, boolean hasAccess) {
        if (name == null) {
            return new NullUser();
        }
        return new RealUser(name, hasAccess);
    }
}
