package nelson.neural.net.function;

class Linear implements ActivationFunction {
    private final double coefficient;

    Linear(final double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public double calculate(final double value) {
        return coefficient * value;
    }
}
