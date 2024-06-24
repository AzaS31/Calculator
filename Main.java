public class Main {
    public static void main(String[] args) {
        OperationView view = new OperationView();
        Calculator calculator = new Calculator(view);

        calculator.performOperation(new Addition(), 3, 4);
        calculator.performOperation(new Subtraction(), 2.5, 2);
        calculator.performOperation(new Multiplication(), 5.2, 4.8);
        calculator.performOperation(new Division(), 8.4, 2);
    }
}
