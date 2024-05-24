package pattern.behavior.interpreter;

/**
 * 解释器模式
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("解释器模式");
        Context context = new Context();
        context.setVariables("a", 10);
        context.setVariables("b", 20);
        Expression expression = new AddExpression(
                new NumberExpression(context.getVariables("a")),
                new NumberExpression(context.getVariables("b"))
        );
        Interpreter interpreter = new Interpreter(expression);
        Integer result = interpreter.interpret(context);
        System.out.println(result);
    }
}
