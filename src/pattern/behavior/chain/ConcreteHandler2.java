package pattern.behavior.chain;

public class ConcreteHandler2 extends AbstractHandler{
    @Override
    public void handlerRequest(Request request) {
        if (request.getType().equals("Type2")) {
            System.out.println("ConcreteHandler2 handles request " + request);
        } else {
            getNextHandler().handlerRequest(request);
        }
    }
}
