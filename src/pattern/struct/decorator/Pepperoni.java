package pattern.struct.decorator;

/**
 * 具体装饰器
 */
public class Pepperoni extends ToppingDecorator{
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "，意大利辣香肠";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.00;
    }
}
