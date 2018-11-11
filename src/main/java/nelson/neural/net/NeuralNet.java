package nelson.neural.net;

import java.util.List;

public class NeuralNet {

    private NeuralLayer inputLayer;
    private List<NeuralLayer> hiddenLayers;
    private NeuralLayer outputLayer;

    NeuralNet(final NeuralLayer inputLayer, final List<NeuralLayer> hiddenLayers, final NeuralLayer outputLayer) {
        this.inputLayer = inputLayer;
        this.hiddenLayers = hiddenLayers;
        this.outputLayer = outputLayer;
    }

    public List<Double> calculate(final List<Double> input) {
        List<Double> previousOutput = inputLayer.calculate(input);
        for (final NeuralLayer hidden : hiddenLayers) {
            previousOutput = hidden.calculate(previousOutput);
        }
        return outputLayer.calculate(previousOutput);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Neural Network: " + super.toString() + "\n");
        sb.append("\tInputs: " + inputLayer.getNeuronCount() + "\n");
        sb.append("\tOutputs: " + outputLayer.getNeuronCount() + "\n");
        sb.append("\tHidden Layers: " + hiddenLayers.size() + "\n");
        for (int h = 0; h < hiddenLayers.size(); h++) {
            sb.append("\t\tHidden Layer " + h + ": " + hiddenLayers.get(h) + "\n");
        }
        return sb.toString();
    }
}
