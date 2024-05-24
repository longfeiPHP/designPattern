package pattern.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Integer> variables = new HashMap<>();

    public void setVariables(String name, Integer value) {
        variables.put(name, value);
    }

    public int getVariables(String name) {
        return variables.get(name);
    }
}
