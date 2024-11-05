public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        Calculator calculator = new Calculator();

        ComplexOperation addition = OperationFactory.getOperation("add");
        ComplexOperation multiplication = OperationFactory.getOperation("multiply");
        ComplexOperation division = OperationFactory.getOperation("divide");

        calculator.calculate(a, b, addition);
        calculator.calculate(a, b, multiplication);
        calculator.calculate(a, b, division);
    }
}
