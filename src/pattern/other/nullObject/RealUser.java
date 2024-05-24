package pattern.other.nullObject;

public class RealUser implements User{
    private String name;
    private boolean hasAccess;

    public RealUser(String name, boolean hasAccess) {
        this.name = name;
        this.hasAccess = hasAccess;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean hasAccess() {
        return hasAccess;
    }
}
