import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        CalculatorLog logger = new CalculatorLog(new LoggerView());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите действительную часть первого комплексного числа: ");
        double realPart1 = scanner.nextDouble();
        System.out.print("Введите мнимую часть первого комплексного числа: ");
        double imaginaryPart1 = scanner.nextDouble();

        ComplexNumber complexNumber1 = new ComplexNumber(realPart1, imaginaryPart1);
        logger.logAdd(complexNumber1);

        System.out.print("Введите действительную часть второго комплексного числа: ");
        double realPart2 = scanner.nextDouble();
        System.out.print("Введите мнимую часть второго комплексного числа: ");
        double imaginaryPart2 = scanner.nextDouble();
        ComplexNumber complexNumber2 = new ComplexNumber(realPart2, imaginaryPart2);
        logger.logAdd(complexNumber2);

        System.out.print("Выберите операцию (1 - сложение; 2 - умножение; 3 - деление): ");
        String operation = scanner.next();
        switch (operation) {
            case "1":
                ComplexNumber result = complexNumber1.sum(complexNumber2);
                logger.logSum(complexNumber1, complexNumber2);
                System.out.println("Результат: " + result);
                break;
            case "2":
                result = complexNumber1.multiply(complexNumber2);
                logger.logMult(complexNumber1, complexNumber2);
                System.out.println("Результат: " + result);
                break;
            case "3":
                result = complexNumber1.divide(complexNumber2);
                logger.logDiv(complexNumber1, complexNumber2);
                System.out.println("Результат: " + result);
                break;
            default:
                break;
        }
    }
}
