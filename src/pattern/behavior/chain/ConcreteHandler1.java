package pattern.behavior.chain;


public class ConcreteHandler1 extends AbstractHandler {
    @Override
    public void handlerRequest(Request request) {
        if (request.getType().equals("Type1")) {
            System.out.println("ConcreteHandler1 handles request " + request);
        } else {
            getNextHandler().handlerRequest(request);
        }
    }
}
