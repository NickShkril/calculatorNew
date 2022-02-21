package pro.sky.calculatorNew;

import org.springframework.stereotype.Service;

@Service
public class CalulatorServiceImpl implements CalculatorSerivce {

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль");
        }
        return num1 / num2;
    }
}
