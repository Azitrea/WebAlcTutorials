package hu.iit.me.controller;

import hu.iit.me.controller.service.Calculator;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@RequestMapping("/calc")
public class CalculatorController {

    private Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String add(@RequestParam(value = "a") double a,@RequestParam(value = "b") double b){
        return String.valueOf(calculator.add(a,b));
    }

    @RequestMapping(value = "/sub", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String sub(@RequestParam(value = "a") double a,@RequestParam(value = "b") double b){
        return String.valueOf(calculator.subtract(a,b));
    }

    @RequestMapping(value = "/mul", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String mul(@RequestParam(value = "a") double a,@RequestParam(value = "b") double b){
        return String.valueOf(calculator.multiply(a,b));
    }

    @RequestMapping(value = "/div", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String div(@RequestParam(value = "a") double a,@RequestParam(value = "b") double b){
        return String.valueOf(calculator.divide(a,b));
    }
}
