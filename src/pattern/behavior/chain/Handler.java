package pattern.behavior.chain;

public interface Handler {
    Handler setNexTHandler(Handler handler);
    void handlerRequest(Request request);
}
