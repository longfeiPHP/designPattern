package pattern.other.filter;

/**
 * 日志过滤器
 */
public class LogFilter implements Filter {
    @Override
    public void doFilter(String request) {
        System.out.println("Log:" + request);
    }
}
