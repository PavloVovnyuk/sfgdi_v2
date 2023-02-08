package kraken.sfgdi_v2;

import kraken.sfgdi_v2.Controllers.ConstructorInjectedController;
import kraken.sfgdi_v2.Controllers.I18nController;
import kraken.sfgdi_v2.Controllers.MyController;
import kraken.sfgdi_v2.Controllers.PropertyInjectedController;
import kraken.sfgdi_v2.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiV2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiV2Application.class, args);
        MyController myController = (MyController) context.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);


        System.out.println("--------Profile");
        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("--------Primary");
        System.out.println(myController.sayHello());

        System.out.println("--------Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean(
            "propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean(
            "setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("--------Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean(
            "constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }
}
