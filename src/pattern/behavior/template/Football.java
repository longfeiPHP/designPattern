package pattern.behavior.template;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("football initialized");
    }

    @Override
    void startPlay() {
        System.out.println("football started");
    }

    @Override
    void endPlay() {
        System.out.println("football ended");
    }
}
