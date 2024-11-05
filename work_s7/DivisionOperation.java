public class DivisionOperation implements ComplexOperation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImaginaty() * b.getImaginaty();
        double realPart = (a.getReal() * b.getReal() + a.getImaginaty() * b.getImaginaty()) / denominator;
        double imaginaryPart = (a.getImaginaty() * b.getReal() - a.getReal() * b.getImaginaty()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
