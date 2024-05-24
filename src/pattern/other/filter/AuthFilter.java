package pattern.other.filter;

/**
 * 授权过滤器
 */
public class AuthFilter implements Filter {
    @Override
    public void doFilter(String request) {
        System.out.println("auth:" + request);
    }
}
