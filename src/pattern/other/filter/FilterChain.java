package pattern.other.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private int index = 0;

    /**
     * 添加过滤器
     *
     * @param filter 过滤器
     */
    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void doFilter(String request) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request);
        doFilter(request);
    }
}
