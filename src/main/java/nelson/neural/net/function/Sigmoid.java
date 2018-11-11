package nelson.neural.net.function;

/**
 * Created by Nelson on 10-Nov-18.
 */
class Sigmoid implements ActivationFunction {
    private final double coefficient;

    Sigmoid(final double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public double calculate(final double value) {
        return 1.0 / (1.0 + Math.exp(-coefficient * value));
    }
}
