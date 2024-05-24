package pattern.behavior.template;

public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("cricket initialized");
    }

    @Override
    void startPlay() {
        System.out.println("cricket started");
    }

    @Override
    void endPlay() {
        System.out.println("cricket ended");
    }
}
