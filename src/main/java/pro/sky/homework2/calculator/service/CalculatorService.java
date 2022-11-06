package pro.sky.homework2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    static public double plusCalculator(double num1, double num2) {
        return num1+num2;
    }

    static public double minusCalculator(double num1, double num2) {
        return num1-num2;
    }

    static public double multiplyCalculator(double num1, double num2) {
        return num1*num2;
    }

    static public double divideCalculator(double num1, double num2) {
        if(num2==0) throw new IllegalArgumentException("На 0 делить нельзя");
        return (double)num1/num2;
    }
}


