package nelson.neural.net.function;

class Step implements ActivationFunction {

    Step() {}

    @Override
    public double calculate(double value) {
        return value < 0 ? 0.0 : 1.0;
    }
}
