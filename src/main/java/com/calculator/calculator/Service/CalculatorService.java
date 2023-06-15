package com.calculator.calculator.Service;

import com.calculator.calculator.Module.Calculator;

@org.springframework.stereotype.Service
public class CalculatorService {

    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }
    public Integer divide(Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {
            if (num2 == 0) {
                throw new IllegalArgumentException("Деление на ноль недопустимо");
            }
            return num1 / num2;
        }
        return 0;
    }


}
