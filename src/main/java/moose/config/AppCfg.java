package moose.config;

import moose.model.GFInfo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

public class AppCfg {

    private String name;
    private int age;
    private GFInfo gf;

    public GFInfo getGf() {
        return gf;
    }

    public void setGf(GFInfo gf) {
        this.gf = gf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
