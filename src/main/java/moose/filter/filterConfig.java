package moose.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class filterConfig {

    @Bean
    public FilterRegistrationBean loggingFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        registrationBean.setFilter(new TransactionFilter());

        registrationBean.addUrlPatterns("/welcome/*");

        return registrationBean;

    }

}
