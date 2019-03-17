package moose.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Component
//@Order(1)
public class RequestResponseFilter implements Filter {
    @Override public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        System.out.println(String.format("Logging Request  {%s} : {%s}", req.getMethod(), req.getRequestURI()));


        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Logging Response :" + res.getContentType());


    }

    @Override public void destroy() {
        System.out.println("RequestResponseFilter destroy...");
    }
}
