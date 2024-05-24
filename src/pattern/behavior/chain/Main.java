package pattern.behavior.chain;

/**
 * 责任链模式
 */
public class Main {
    public static void main(String[] args){
        System.out.println("责任链模式");
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setNexTHandler(handler1).setNexTHandler(handler2);
        handler1.handlerRequest(new Request("Type1"));
        handler1.handlerRequest(new Request("Type2"));
        handler1.handlerRequest(new Request("Type3"));
    }
}
