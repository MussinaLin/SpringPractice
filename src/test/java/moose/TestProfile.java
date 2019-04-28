package moose;

import moose.Application;
import moose.config.AppBean;
import moose.config.AppCfg;
import moose.model.GFInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class })
//@TestPropertySource(locations = "classpath:application-dev.properties")
public class TestProfile {

    @Autowired
    private GFInfo gfInfo;

    @Autowired
    private AppCfg appCfg;

    @Test
    public void test_gfInfo(){
        System.out.println(gfInfo.getName());
        System.out.println(gfInfo.getAge());
        System.out.println(gfInfo.getTall());
    }

    @Test
    public void test_appCfg(){
        System.out.println(appCfg.getGf().getName());
        System.out.println(appCfg.getGf().getAge());
        System.out.println(appCfg.getGf().getTall());
    }
}
