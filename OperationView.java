import java.util.logging.Logger;

public class OperationView {
    private static final Logger logger = Logger.getLogger(OperationView.class.getName());

    void printOperation(Operation operation, double a, double b) {
        double result = operation.execute(a, b);
        logger.info("Выполнена операция: " + a + " " + operationSymbol(operation) + " " + b + " = " + result);
        System.out.println("Результат операции: " + result);
    }

    private String operationSymbol(Operation operation) {
        if (operation instanceof Addition) {
            return "+";
        } else if (operation instanceof Subtraction) {
            return "-";
        } else if (operation instanceof Multiplication) {
            return "*";
        } else if (operation instanceof Division) {
            return "/";
        }
        return "";
    }
}