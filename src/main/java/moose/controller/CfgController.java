package moose.controller;

import moose.config.AppBean;
import moose.config.AppCfg;
import moose.model.GFInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CfgController {

    @Autowired
    private AppCfg appCfg;

    @Autowired
    private GFInfo gfInfo;

    @RequestMapping(method = RequestMethod.GET, path = "/cfg")
    public AppCfg getAppCfg(){
        return appCfg;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/appBean")
    public GFInfo getAppBean(){
        System.out.println(gfInfo.getName());
        return gfInfo;
    }

}
