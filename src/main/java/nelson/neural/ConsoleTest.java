package nelson.neural;

import nelson.neural.net.NeuralNet;
import nelson.neural.net.NeuralNetBuilder;
import nelson.neural.net.function.ActivationFunctionFactory;
import nelson.neural.net.util.Rng;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nelson on 10-Nov-18.
 */
public class ConsoleTest {

    public static void main(final String[] args) {
        Rng.reset(0);
        System.out.println("Creating Neural Network...");
        final NeuralNet nn = NeuralNetBuilder.net(2)
                .withHiddenLayer(3, ActivationFunctionFactory.sigmoid())
                .build(1, ActivationFunctionFactory.linear());
        System.out.println("Neural Network created!");
        System.out.println(nn);

        List<Double> neuralInput = Arrays.asList(1.5, 0.5);
        System.out.println("Feeding the values " + neuralInput + " to the neural network");
        List<Double> neuralOutput = nn.calculate(neuralInput);
        System.out.println("Output generated:" + neuralOutput);

        neuralInput = Arrays.asList(1.0, 2.1);
        System.out.println("Feeding the values " + neuralInput + " to the neural network");
        neuralOutput = nn.calculate(neuralInput);
        System.out.println("Output generated:" + neuralOutput);

    }

}
