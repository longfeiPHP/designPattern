package pattern.struct.decorator;

/**
 * 具体组件
 */

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "薄饼";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
