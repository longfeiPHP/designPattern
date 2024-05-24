package pattern.behavior.state;

public class ConcreteState1 implements State{
    @Override
    public void handle() {
        System.out.println("ConcreteState1 is handling");
    }
}
