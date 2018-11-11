package nelson.neural.net;

import nelson.neural.net.function.ActivationFunctionFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nelson on 10-Nov-18.
 */
public class InputLayer extends NeuralLayer {

    public InputLayer(int numberOfInputs) {
        super(numberOfInputs, ActivationFunctionFactory.linear());
        initializeNeurons(numberOfInputs, 1, 0.0);
    }


    @Override
    public List<Double> calculate(final List<Double> input) {
        final ArrayList<Double> output = new ArrayList<>(getNeuronCount());
        for (int i = 0; i < getNeuronCount(); i++) {
            final Neuron neuron = neurons.get(i);
            final List<Double> singleInput = Arrays.asList(input.get(i));
            output.add(neuron.calculate(singleInput));
        }
        return output;
    }
}
