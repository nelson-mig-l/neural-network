package nelson.neural.net.function;

/**
 * Created by Nelson on 10-Nov-18.
 */
class Step implements ActivationFunction {

    Step() {}

    @Override
    public double calculate(double value) {
        return value < 0 ? 0.0 : 1.0;
    }
}
