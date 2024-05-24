package pattern.create.singleton;

/**
 * 单例模式(饿汉式): 类加载时就会创建实例，浪费内存，但执行效率高
 *  1. 该类只有一个实例
 *  2. 实例必须自己创建
 *  3. 单例类必须给所有其他对象提供这一实例
 */
public class Singleton1 {
    // 实例化自己
    private static Singleton1 instance = new Singleton1();
    /**
     * 私有构造函数，该类不能在外部实例化
     */
    private Singleton1() {}
    /**
     * 返回实例化对象
     */
    public static Singleton1 getInstance() {
        return instance;
    }

}

