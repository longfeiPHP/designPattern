package pattern.struct.proxy;

/**
 * 代理模式
 * HelloStaticProxy 是个代理类 帮助其他类执行，并添加自己的行为
 */
public class Main {
    public static void main(String[] args) {
        /*静态代理*/
//        IHello helloProxy = new HelloStaticProxy(new HelloImpl());
//        helloProxy.hi("world");
        /*jdk代理*/
        JdkProxy proxy = new JdkProxy(new HelloImpl());
        IHello helloProxy = proxy.getProxy();
        helloProxy.hi("jdk proxy !");
    }
}
