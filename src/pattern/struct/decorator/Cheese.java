package pattern.struct.decorator;

/**
 * 具体装饰器
 */
public class Cheese extends ToppingDecorator{
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "，马苏里拉奶酪";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.50;
    }
}
