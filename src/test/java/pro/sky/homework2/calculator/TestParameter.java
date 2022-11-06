package pro.sky.homework2.calculator;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.homework2.calculator.service.CalculatorService;
import java.util.stream.Stream;

public class TestParameter {
    private static final Double NEGATIVE_FIVE = -5.0 ;
    private static final Double FIVE =5.0 ;
    private final CalculatorService calculatorService=new CalculatorService();

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of( FIVE, FIVE),
                Arguments.of( NEGATIVE_FIVE,NEGATIVE_FIVE)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void calculatorPlusParameter(Double num1, Double num2) {
        String expected = String.valueOf(CalculatorService.plusCalculator(num1, num2));
        String actual= String.valueOf(num1+num2);
        Assertions.assertEquals(actual,expected);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void calculatorMinusParameter(Double num1, Double num2) {
        String expected = String.valueOf(CalculatorService.minusCalculator(num1, num2));
        String actual= String.valueOf(num1-num2);
        Assertions.assertEquals(actual,expected);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void calculatorMultipleParameter(Double num1, Double num2) {
        String expected = String.valueOf(CalculatorService.multiplyCalculator(num1, num2));
        String actual= String.valueOf(num1*num2);
        Assertions.assertEquals(actual,expected);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void calculatorDivideParameter(Double num1, Double num2) {
        String expected = String.valueOf(CalculatorService.divideCalculator(num1, num2));
        String actual= String.valueOf(num1/num2);
        Assertions.assertEquals(actual,expected);
    }
}
