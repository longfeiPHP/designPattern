package pattern.behavior.mediator;

public interface Mediator {
    void send(String message, Colleague colleague);
}
