public class CalculatorLog implements Logger {
    private Logger logger;

    public CalculatorLog(Logger logger) {
        this.logger = logger;
    }

    private void logOperation(String operation, ComplexNumber complexNumber1, ComplexNumber ComplexNumber2) {
        String message = "Производится " + operation + " " + complexNumber1 + " и " + ComplexNumber2;
        logger.log(message);
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }

    public void logAdd(ComplexNumber complexNumber) {
        String message = ("Добавлено число" + complexNumber);
        logger.log(message);
    }

    public void logSum(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        logOperation("Сложение", complexNumber1, complexNumber2);
    }

    public void logMult(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        logOperation("Умножение", complexNumber1, complexNumber2);
    }

    public void logDiv(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        logOperation("Деление", complexNumber1, complexNumber2);
    }
}
