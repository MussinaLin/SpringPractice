package moose.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import moose.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("heal")
@Api(description = "user health")
public class HealthController implements HealthIndicator {

    private int health = 0;

    @ApiOperation(value = "changeHealth", notes = "changeHealth Notes.")
    @RequestMapping(value = "/changeHealth", method = RequestMethod.POST)
    public String changeHealth(){
        health = health == 0? 1:0;
        return String.valueOf(health);
    }

    @RequestMapping(value = "/usersInfo", method = RequestMethod.POST)
    @ApiOperation(value = "user info")
    public Map<Integer, String>  getUserInfo(@RequestParam("name") String name){
        Map<Integer, String> infos = new HashMap<>();
        infos.put(1,name);
        infos.put(2,"user2");
        infos.put(3,"user3");
        return infos;
    }

    @Override public Health health() {
        if(health == 0)
           return Health.down().withDetail("errorCode","404").build();
        else
            return Health.up().build();
    }
}