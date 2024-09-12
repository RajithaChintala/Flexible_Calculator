import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<Operation, OperationStrategy> strategies;

    public Calculator() {
        this.strategies = new HashMap<>();
        this.strategies.put(Operation.ADD, new AdditionStrategy());
        this.strategies.put(Operation.SUBTRACT, new SubtractionStrategy());
        this.strategies.put(Operation.MULTIPLY, new MultiplicationStrategy());
        this.strategies.put(Operation.DIVIDE, new DivisionStrategy());
    }

    public double calculate(Operation op, double num1, double num2) {
        if (!strategies.containsKey(op)) {
            throw new UnsupportedOperationException("Operation not supported");
        }
        return strategies.get(op).execute(num1, num2);
    }

    public double chainOperations(double initialValue, Operation... operations) {
        double result = initialValue;
        for (Operation op : operations) {
            result = calculate(op, result, operations[operations.length - 1]);
        }
        return result;
    }
}