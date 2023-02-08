package kraken.sfgdi_v2.Controllers;

import kraken.sfgdi_v2.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
@Qualifier("setterInjecterService")
    @Autowired
    private GreetingService greetingService;

    public SetterInjectedController setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
        return null;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
