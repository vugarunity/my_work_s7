import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b, ComplexOperation operation) {
        logger.info("Выполняется операция " + operation.getClass().getSimpleName());
        ComplexNumber result = operation.execute(a, b);
        logger.log(Level.INFO, "Результат: {0}", result);
        return result;
    }
}
