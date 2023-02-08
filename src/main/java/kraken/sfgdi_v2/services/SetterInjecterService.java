package kraken.sfgdi_v2.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjecterService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - setter";
    }

}
