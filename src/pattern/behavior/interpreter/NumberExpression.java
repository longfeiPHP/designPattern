package pattern.behavior.interpreter;

public class NumberExpression implements Expression{
    private Integer value;

    public NumberExpression(Integer value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }
}
