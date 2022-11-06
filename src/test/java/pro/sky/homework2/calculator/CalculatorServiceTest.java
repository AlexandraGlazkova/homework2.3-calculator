package pro.sky.homework2.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.homework2.calculator.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService=new CalculatorService();
    final Double num1 = 2.0;
    final Double num2 = 5.0;

    final Double getNum1 = 10.0;
    final Double getNum2 = 11.0;
    final Double getGetNum2 = (double) 0;

    @Test
    public void calculatorPlus() {
        assertEquals((num1 + num2), CalculatorService.plusCalculator(num1, num2));
        assertEquals((getNum1 + getNum2), CalculatorService.plusCalculator(getNum1, getNum2));

    }

    @Test
    public void calculatorMinus() {
        assertEquals((num1 - num2), CalculatorService.minusCalculator(num1, num2));
        assertEquals((getNum1 - getNum2), CalculatorService.minusCalculator(getNum1, getNum2));

    }

    @Test
    public void calculatorMultiple() {
        assertEquals((num1 *num2), CalculatorService.multiplyCalculator(num1, num2));
        assertEquals((getNum1 * getNum2), CalculatorService.multiplyCalculator(getNum1, getNum2));

    }

    @Test
    public void calculatorDivide() {
        assertEquals( (num1/ num2), CalculatorService.divideCalculator(num1, num2));
        assertEquals( (getNum1 / getNum2), CalculatorService.divideCalculator(getNum1, getNum2));

    }

    @Test
    public void calculatorException() {
        assertThrows(IllegalArgumentException.class,()->CalculatorService.divideCalculator(getNum1,getGetNum2));
    }

}
