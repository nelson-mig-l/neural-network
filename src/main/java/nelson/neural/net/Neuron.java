package nelson.neural.net;

import nelson.neural.net.function.ActivationFunction;
import nelson.neural.net.util.Rng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Neuron {

    private final int numberOfInputs;
    private final ActivationFunction activationFunction;
    private final double bias; // It should be always 1.0, except for the first layer.
    private final List<Double> weights;

    public enum Type {
        REGULAR {
            @Override
            Neuron create(int numberOfInputs, ActivationFunction activationFunction) {
                final List<Double> weights = new ArrayList<>(numberOfInputs + 1); // +1 for bias
                for (int i = 0; i <= numberOfInputs; i++) {
                    weights.add(Rng.generate());
                }
                return new Neuron(numberOfInputs, activationFunction, 1.0, weights);
            }
        }, INPUT {
            @Override
            Neuron create(int numberOfInputs, ActivationFunction activationFunction) {
                final List<Double> weights = Arrays.asList(1.0, 0.0);
                return new Neuron(numberOfInputs, activationFunction, 0.0, weights);
            }
        };

        abstract Neuron create(final int numberOfInputs, final ActivationFunction activationFunction);
    }

    private Neuron(final int numberOfInputs, final ActivationFunction activationFunction, final double bias, final List<Double> weights) {
        this.numberOfInputs = numberOfInputs;
        this.activationFunction = activationFunction;
        this.bias = bias;
        this.weights = weights;
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
