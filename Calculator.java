public class Calculator {
    private final OperationView view;

    public Calculator(OperationView view) {
        this.view = view;
    }

    public void performOperation(Operation operation, double a, double b) {
        view.printOperation(operation, a, b);
    }
}
