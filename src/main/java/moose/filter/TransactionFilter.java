package moose.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@Component
//@Order(2)
public class TransactionFilter implements Filter {
    @Override public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        System.out.println("Starting a transaction for req : " + req.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Committing a transaction for req : " +  req.getRequestURI());
    }

    @Override public void destroy() {
        System.out.println("TransactionFilter destroy...");
    }

}
