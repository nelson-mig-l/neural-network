package nelson.neural.net;

import nelson.neural.net.function.ActivationFunction;

import java.util.ArrayList;
import java.util.List;

public abstract class NeuralLayer {

    protected final List<Neuron> neurons;
    private final ActivationFunction activationFunction;

    protected NeuralLayer(final int numberOfNeurons, final ActivationFunction activationFunction) {
        this.neurons = new ArrayList<>(numberOfNeurons);
        this.activationFunction = activationFunction;
    }

    protected void initializeNeurons(final int numberOfNeurons, final int numberOfInputs, final Neuron.Type neuronType) {
        for (int i = 0; i < numberOfNeurons; i++) {
            final Neuron neuron = neuronType.create(numberOfInputs, activationFunction);
            neurons.add(neuron);
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
