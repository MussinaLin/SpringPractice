package moose.config;

import moose.model.GFInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppBean {

    @Bean
    public GFInfo getGFInfo(){
        GFInfo i = new GFInfo();
        i.setName("pzs");
        i.setAge(24);
        i.setTall(165);
        return i;
    }
}
