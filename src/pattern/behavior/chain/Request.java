package pattern.behavior.chain;

public class Request {
    private String type;

    public Request(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Request{" +
                "type='" + type + '\'' +
                '}';
    }
}
