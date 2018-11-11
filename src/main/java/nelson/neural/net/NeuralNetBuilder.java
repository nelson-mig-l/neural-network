package nelson.neural.net;

import nelson.neural.net.function.ActivationFunction;

import java.util.ArrayList;
import java.util.List;

public class NeuralNetBuilder {

    public static NeuralNetBuilder net(final int numberOfInputs) {
        return new NeuralNetBuilder(numberOfInputs);
    }

    private final NeuralLayer inputLayer;
    private final List<NeuralLayer> hiddenLayers ;

    private NeuralNetBuilder(final int numberOfInputs) {
        inputLayer = new InputLayer(numberOfInputs);
        hiddenLayers = new ArrayList<>();
    }

    public NeuralNetBuilder withHiddenLayer(final int numberOfNeurons, final ActivationFunction activationFunction) {
        hiddenLayers.add(new HiddenLayer(numberOfNeurons, getLastLayerNumberOfNeurons(), activationFunction));
        return this;
    }

    public NeuralNet build(final int numberOfOutputs, final ActivationFunction activationFunction) {
        NeuralLayer outputLayer = new OutputLayer(getLastLayerNumberOfNeurons(), numberOfOutputs, activationFunction);
        return new NeuralNet(inputLayer, hiddenLayers, outputLayer);
    }

    private int getLastLayerNumberOfNeurons() {
        final NeuralLayer lastLayer = hiddenLayers.isEmpty() ? inputLayer : hiddenLayers.get(hiddenLayers.size() - 1);
        return lastLayer.getNeuronCount();
    }

}
