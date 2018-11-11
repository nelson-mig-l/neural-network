package nelson.neural.net;

import nelson.neural.net.function.ActivationFunction;

public class OutputLayer extends NeuralLayer {

    OutputLayer(final int numberOfInputs, final int numberOfNeurons, final ActivationFunction activationFunction) {
        super(numberOfNeurons, activationFunction);
        initializeNeurons(numberOfNeurons, numberOfInputs, Neuron.Type.REGULAR);
    }

}
