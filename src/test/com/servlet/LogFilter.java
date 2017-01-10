package test.com.servlet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
//        String site = config.getInitParameter("Site");
//        System.out.println("site name : " + site);
        System.out.println("begin");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws java.io.IOException, ServletException {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("site url : http://www.runoob.com");
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if (!"wang".equals(username)) {
//            request.setAttribute("message", "name error");
//            request.getRequestDispatcher("/login.html").forward(request, response);
//            System.out.println("1");
//            return;
//        }
//
//        if ("1".equals(password)) {
//            request.setAttribute("message", "password error");
//            request.getRequestDispatcher("/login.html").forward(request, response);
//            return;
//        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // TODO 自動生成されたメソッド・スタブ
        
    }

}
