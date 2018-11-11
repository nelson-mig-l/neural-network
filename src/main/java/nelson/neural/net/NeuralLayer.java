package nelson.neural.net;

import nelson.neural.net.function.ActivationFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nelson on 10-Nov-18.
 */
public abstract class NeuralLayer {

    protected final List<Neuron> neurons;
    private final ActivationFunction activationFunction;

    protected NeuralLayer(final int numberOfNeurons, final ActivationFunction activationFunction) {
        this.neurons = new ArrayList<>(numberOfNeurons);
        this.activationFunction = activationFunction;
    }

    protected void initializeNeurons(final int numberOfNeurons, final int numberOfInputs, final double bias) {
        for (int i = 0; i < numberOfNeurons; i++) {
            neurons.add(new Neuron(numberOfInputs, activationFunction, bias));
        }
    }

    public int getNeuronCount() {
        return neurons.size();
    }

    public List<Double> calculate(final List<Double> input) {
        final ArrayList<Double> output = new ArrayList<>(getNeuronCount());
        for (final Neuron neuron : neurons) {
            output.add(neuron.calculate(input));
        }
        return output;
    }

    @Override
    public String toString() {
        return getNeuronCount() + " neurons " + activationFunction.getClass().getSimpleName();
    }


}
