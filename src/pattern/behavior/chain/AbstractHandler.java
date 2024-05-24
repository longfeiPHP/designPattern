package pattern.behavior.chain;

import com.sun.net.httpserver.Request;

public abstract class AbstractHandler implements Handler {
    private Handler nextHandler;

    @Override
    public Handler setNexTHandler(Handler handler) {
        this.nextHandler = handler;
        return this.nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }
}
