package pattern.struct.proxy;

/**
 * 代理接口实现
 */
public class HelloImpl implements IHello {
    @Override
    public String hi(String key) {
        String str = "Hello" + key;
        System.out.println("Hello Impl!" + str);
        return str;
    }
}
