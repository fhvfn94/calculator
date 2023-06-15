package com.calculator.calculator;

import com.calculator.calculator.Module.Calculator;
import com.calculator.calculator.Service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	@DisplayName("тест метода plus")
	public void plus() {
		CalculatorService calculatorService = new CalculatorService();
		Integer result1 = calculatorService.plus(1, 5);
		Integer result2 = calculatorService.plus(result1, 6);
		Assertions.assertEquals(result2, 12);
		Assertions.assertEquals(result1, 6);
		Assertions.assertNotEquals(result1, result2);
		Assertions.assertNotNull(result1);
	}

	@Test
	@DisplayName("тест метода minus")
	public void minus() {
		CalculatorService calculatorService = new CalculatorService();
		Integer result1 = calculatorService.minus(14, 4);
		Integer result2 = calculatorService.minus(3, 4);
		Assertions.assertNotEquals(result1, result2);
		Assertions.assertNotNull(result1);
	}

	@Test
	@DisplayName("тест метода multiply")
	public void multiply() {
		CalculatorService calculatorService = new CalculatorService();
		Integer result1 = calculatorService.minus(3, 4);
		Integer result2 = calculatorService.minus(3, 4);
		Assertions.assertNotEquals(result1, result2);
		Assertions.assertNotNull(result1);
	}

	@Test
	@DisplayName("тест метода divide")
	public void divide() {
		CalculatorService calculatorService = new CalculatorService();

		// Проверяем деление на ненулевое число
		Integer result1 = calculatorService.divide(12, 4);
		Assertions.assertEquals(3, result1);

		// Проверяем деление на 0, ожидаем исключение IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			calculatorService.divide(3, 0);
		});
	}
}
