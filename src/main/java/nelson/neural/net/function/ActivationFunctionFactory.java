package nelson.neural.net.function;

public class ActivationFunctionFactory {

    public static final double DEFAULT_COEFFICIENT = 1.0;

    public static ActivationFunction linear() {
        return linear(DEFAULT_COEFFICIENT);
    }

    private static ActivationFunction linear(final double coefficient) {
        return new Linear(coefficient);
    }

    public static ActivationFunction sigmoid() {
        return sigmoid(DEFAULT_COEFFICIENT);
    }

    public static ActivationFunction sigmoid(final double coefficient) {
        return new Sigmoid(coefficient);
    }

    public static ActivationFunction hypertan() {
        return hypertan(DEFAULT_COEFFICIENT);
    }

    public static ActivationFunction hypertan(final double coefficient) {
        return new HyperTan(coefficient);
    }

    public static ActivationFunction step() {
        return new Step();
    }
}
