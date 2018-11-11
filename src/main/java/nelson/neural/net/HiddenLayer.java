package nelson.neural.net;

import nelson.neural.net.function.ActivationFunction;

public class HiddenLayer extends NeuralLayer {

    HiddenLayer(final int numberOfNeurons, final int numberOfInputs, final ActivationFunction activationFunction) {
        super(numberOfNeurons, activationFunction);
        initializeNeurons(numberOfNeurons, numberOfInputs, Neuron.Type.REGULAR);
    }

}
