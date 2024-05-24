package pattern.struct.adapter;

public class AdapterMain {
    /**
     * 适配器模式 Adapter Pattern
     * 是一种结构型设计模式，它允许不兼容接口之间进行通信
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1. Adapter 实现 Target 接口, 接口中有request()方法, 但是该方法不实现业务逻辑
         * 2. Adapter 注入 Adaptee 实例 在Adapter中调用 Adaptee 实例中的方法
         */
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
