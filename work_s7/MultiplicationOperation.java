public class MultiplicationOperation implements ComplexOperation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() * b.getReal() - a.getImaginaty() * b.getImaginaty();
        double imaginaryPart = a.getReal() * b.getImaginaty() + a.getImaginaty() * b.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
