package moose.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String retrieveWelcomeMessage() {
        return "Good Morning updated";
    }
}
