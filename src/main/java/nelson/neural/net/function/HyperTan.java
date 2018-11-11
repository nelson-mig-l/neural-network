package nelson.neural.net.function;

/**
 * Created by Nelson on 10-Nov-18.
 */
class HyperTan implements ActivationFunction {

    private final double coefficient;

    HyperTan(final double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public double calculate(final double value) {
        return (1.0 - Math.exp(-coefficient * value)) / (1.0 + Math.exp(-coefficient * value));
    }
}
