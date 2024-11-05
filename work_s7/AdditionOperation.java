public class AdditionOperation implements ComplexOperation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double realSum = a.getReal() + b.getReal();
        double imaginarySum = a.getImaginaty() + b.getImaginaty();
        return new ComplexNumber(realSum, imaginarySum);
    }
}
