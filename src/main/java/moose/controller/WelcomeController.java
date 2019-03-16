package moose.controller;

import moose.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeController implements HealthIndicator {

    @Autowired
    private WelcomeService service;

    private int health = 0;

    @RequestMapping("/welcomeMsg")
    public String welcome() {
        return service.retrieveWelcomeMessage();
    }

    @RequestMapping("/changeHealth")
    public String changeHealth(){
        health = health == 0? 1:0;
        return String.valueOf(health);
    }

    @Override public Health health() {
        if(health == 0)
           return Health.down().withDetail("errorCode","404").build();
        else
            return Health.up().build();
    }
}