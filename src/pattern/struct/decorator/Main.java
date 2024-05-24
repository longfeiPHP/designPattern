package pattern.struct.decorator;

public class Main {
    /**
     * 装饰器模式
     * @param args
     */
    public static void main(String[] args){
        Pizza pizza = new PlainPizza();
        pizza = new Cheese(pizza);
        pizza = new Pepperoni(pizza);
        System.out.println(pizza.getDescription());
        System.out.println("成本：$" + pizza.getCost());
    }
}
