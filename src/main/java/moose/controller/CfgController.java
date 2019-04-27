package moose.controller;

import moose.config.AppCfg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CfgController {

    @Autowired
    private AppCfg appCfg;

    @RequestMapping(method = RequestMethod.GET, path = "/cfg")
    public void getCfg(){
        System.out.println(appCfg.getName());
        System.out.println(appCfg.getAge());

        System.out.println(appCfg.getGf().getName());
        System.out.println(appCfg.getGf().getAge());
        System.out.println(appCfg.getGf().getTall());
    }

}
