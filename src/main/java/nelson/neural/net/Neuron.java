package nelson.neural.net;

import nelson.neural.net.function.ActivationFunction;
import nelson.neural.net.util.Rng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nelson on 10-Nov-18.
 */
public class Neuron {

    private final int numberOfInputs;
    private final ActivationFunction activationFunction;
    private final double bias; // It should be always 1.0, except for the first layer.
    private final List<Double> weights;


    public Neuron(final int numberOfInputs, final ActivationFunction activationFunction, final double bias) {
        this.numberOfInputs = numberOfInputs;
        this.activationFunction = activationFunction;
        this.bias = bias;
        this.weights = new ArrayList<>(numberOfInputs + 1); // +1 for bias
        initWeights();
    }


    private void initWeights() {
        for (int i = 0; i <= numberOfInputs; i++) {
            if (bias == 0.0) {
                // input neuron
                weights.add(1.0);
                weights.add(0.0);
            } else {
                weights.add(Rng.generate());
            }
        }
    }


    public double calculate(final List<Double> inputs) {
        double outputBeforeActivation = 0.0;
        for (int i = 0; i <= numberOfInputs; i++) {
            final double value = i == numberOfInputs ? bias : inputs.get(i);
            outputBeforeActivation += value * weights.get(i);
        }
        return activationFunction.calculate(outputBeforeActivation);
    }

}
