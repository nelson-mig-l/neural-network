package nelson.neural.net;

import nelson.neural.net.function.ActivationFunction;

/**
 * Created by Nelson on 10-Nov-18.
 */
public class HiddenLayer extends NeuralLayer {

    public HiddenLayer(final int numberOfNeurons, final int numberOfInputs, final ActivationFunction activationFunction) {
        super(numberOfNeurons, activationFunction);
        initializeNeurons(numberOfNeurons, numberOfInputs, 1.0);
    }

}
