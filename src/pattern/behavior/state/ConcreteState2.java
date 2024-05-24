package pattern.behavior.state;

public class ConcreteState2 implements State{
    @Override
    public void handle() {
        System.out.println("ConcreteState2 is handling");
    }
}
