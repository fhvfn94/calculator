package com.calculator.calculator.Controller;

import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.core.html.IThrowableRenderer;
import com.calculator.calculator.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;
    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        if (num1 != null && num2 != null && !num1.isEmpty() && !num2.isEmpty() && !num1.isBlank() && !num2.isBlank()){
            return num1 + " + " + num2 + " = " + calculatorService.plus(Integer.parseInt(num1), Integer.parseInt(num2));
        }
        throw new IllegalArgumentException("Ошибка");
    }
    @GetMapping("/minus")
    public String showMinus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        if (num1 != null && num2 != null && !num1.isEmpty() && !num2.isEmpty() && !num1.isBlank() && !num2.isBlank()) {
            return num1 + " - " + num2 + " = " + calculatorService.minus(Integer.parseInt(num1), Integer.parseInt(num2));
        }
        throw new IllegalArgumentException("Ошибка");
    }
    @GetMapping("/multiply")
    public String showMultiply(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        if (num1 != null && num2 != null && !num1.isEmpty() && !num2.isEmpty() && !num1.isBlank() && !num2.isBlank()) {
            return num1 + " * " + num2 + " = " + calculatorService.multiply(Integer.parseInt(num1), Integer.parseInt(num2));
        }
        throw new IllegalArgumentException("Ошибка");
    }
    @GetMapping("/divide")
    public String showDivide(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        if (num1 != null && num2 != null && !num1.isEmpty() && !num2.isEmpty() && !num1.isBlank() && !num2.isBlank()) {
            return num1 + " / " + num2 + " = " + calculatorService.divide(Integer.parseInt(num1), Integer.parseInt(num2));
        }
        throw new IllegalArgumentException("Ошибка");
    }
}