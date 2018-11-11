package nelson.neural.net;

import nelson.neural.net.function.ActivationFunction;

/**
 * Created by Nelson on 10-Nov-18.
 */
public class OutputLayer extends NeuralLayer {

    public OutputLayer(final int numberOfInputs, final int numberOfNeurons, final ActivationFunction activationFunction) {
        super(numberOfNeurons, activationFunction);
        initializeNeurons(numberOfNeurons, numberOfInputs, 1.0);
    }

}
