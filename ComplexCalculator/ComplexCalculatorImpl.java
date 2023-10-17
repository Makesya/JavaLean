package ComplexCalculator;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;

public class ComplexCalculatorImpl implements ComplexCalculator {
    private final Logger logger;

    public ComplexCalculatorImpl() {
        // Настроим логирование
        logger = Logger.getLogger("ComplexCalculator");
        try {
            FileHandler fileHandler = new FileHandler("ComplexCalculator/log.txt", true);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber(
                num1.getReal() + num2.getReal(),
                num1.getImaginary() + num2.getImaginary()
        );
        logger.log(Level.INFO, "Addition: {0} + {1} = {2}", new Object[] {num1, num2, result});
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber(
                num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary(),
                num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal()
        );
        logger.log(Level.INFO, "Multiplication: {0} * {1} = {2}", new Object[] {num1, num2, result});
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        ComplexNumber result = new ComplexNumber(
                (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator,
                (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator
        );
        logger.log(Level.INFO, "Division: {0} / {1} = {2}", new Object[] {num1, num2, result});
        return result;
    }
}

