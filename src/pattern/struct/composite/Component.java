package pattern.struct.composite;

public abstract class Component implements IComponent {
    protected String name;

    public Component(String name) {
        this.name = name;
    }
    public abstract void add(IComponent iComponent);
    public abstract void remove(IComponent iComponent);
}
