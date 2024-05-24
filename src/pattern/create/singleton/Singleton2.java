package pattern.create.singleton;

/**
 * 单例模式(懒汉式): 创建实例时会检索实例是否已存在 双保险检测线程安全
 * 1. 该类只有一个实例
 * 2. 实例必须自己创建
 * 3. 单例类必须给所有其他对象提供这一实例
 */
public class Singleton2 {
    // 设置实例变量 volatile 多线程可见
    private volatile static Singleton2 instance = null;

    /**
     * 私有构造函数，该类不能在外部实例化
     */
    private Singleton2() {
    }

    /**
     * 返回实例化对象 synchronized: 线程互斥, 同一时间只可有一个线程访问同一资源
     */
    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}