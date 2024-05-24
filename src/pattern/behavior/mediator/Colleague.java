package pattern.behavior.mediator;

abstract public class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(String message);

    public abstract void send(String message);
}
