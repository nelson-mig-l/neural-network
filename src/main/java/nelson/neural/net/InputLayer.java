package nelson.neural.net;

import nelson.neural.net.function.ActivationFunctionFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InputLayer extends NeuralLayer {

    InputLayer(int numberOfInputs) {
        super(numberOfInputs, ActivationFunctionFactory.linear());
        // For InputLayer :
        // - numberOfNeurons equals to numberOfInputs
        // - numberOfInputs always one
        initializeNeurons(numberOfInputs, 1, Neuron.Type.INPUT);
    }

    @Override
    public List<Double> calculate(final List<Double> input) {
        final ArrayList<Double> output = new ArrayList<>(getNeuronCount());
        for (int i = 0; i < getNeuronCount(); i++) {
            final Neuron neuron = neurons.get(i);
            final List<Double> singleInput = Collections.singletonList(input.get(i));
            output.add(neuron.calculate(singleInput));
        }
        return output;
    }
}
