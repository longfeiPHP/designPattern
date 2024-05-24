package pattern.other.filter;

/**
 * 过滤器模式
 */
public class Main {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new AuthFilter());/*添加过滤器*/
        filterChain.addFilter(new LogFilter());/*添加过滤器*/
        filterChain.doFilter("req");
    }
}
