package pattern.behavior.memento;

/**
 * 备忘录模式
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("state 1");/*设置Originator类的state属性*/
        caretaker.setMemento(originator.createMemento());/*把state状态放到Memento的state属性中 并 把Memento对象赋值到caretaker的memento属性*/
        originator.setState("state 2");
        originator.restore(caretaker.getMemento());
        System.out.println("Current state: " + originator.getState());
    }
}
