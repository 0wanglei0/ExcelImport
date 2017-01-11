package test.com.servlet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
        System.out.println("begin");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws java.io.IOException, ServletException {
            chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // TODO 自動生成されたメソッド・スタブ

    }

}
