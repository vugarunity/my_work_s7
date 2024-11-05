public class OperationFactory {
    public static ComplexOperation getOperation(String operationType) {
        return switch (operationType) {
            case "add" -> new AdditionOperation();
            case "multiply" -> new MultiplicationOperation();
            case "divide" -> new DivisionOperation();
            default -> throw new IllegalArgumentException("Неизвестная операция");
        };
    }
}
