package web.config;

import hu.iit.me.controller.CalculatorController;
import hu.iit.me.controller.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"web.config","hu.iit.me.controller"})
@PropertySource("classpath:web.properties")
public class CalculatorApplicationContext {

    @Value("${defaultValue}")
    private double defaultvalue;

    @Autowired Calculator calculator;


    @Bean
    public CalculatorController calculatorController(){
        System.out.println(defaultvalue);
        return new CalculatorController(calculator);
    }
}
