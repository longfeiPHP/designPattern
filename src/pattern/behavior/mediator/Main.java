package pattern.behavior.mediator;

/**
 * 中介者模式 有点没明白
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);
        colleague1.send("Hello, Colleague2.");
        colleague1.send("Hello, Colleague1.");
    }
}
