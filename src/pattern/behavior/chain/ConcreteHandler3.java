package pattern.behavior.chain;

public class ConcreteHandler3 extends AbstractHandler {
    @Override
    public void handlerRequest(Request request) {
        if (request.getType().equals("Type3")) {
            System.out.println("ConcreteHandler3 handles request " + request);
        } else {
            getNextHandler().handlerRequest(request);
        }
    }
}
