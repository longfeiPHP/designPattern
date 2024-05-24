package pattern.struct.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * 静态代理类
 */
public class HelloStaticProxy implements IHello {
    private IHello hello;

    public HelloStaticProxy(IHello hello) {
        this.hello = hello;
    }

    @Override
    public String hi(String key) {
        System.out.println(">>> static proxy start");
        String result = hello.hi(key);
        System.out.println(">>> static proxy end");
        return result;
    }
}
