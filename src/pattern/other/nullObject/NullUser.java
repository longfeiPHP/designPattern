package pattern.other.nullObject;

public class NullUser implements User{
    @Override
    public String getName() {
        return "Guest";
    }

    @Override
    public boolean hasAccess() {
        return false;
    }
}
