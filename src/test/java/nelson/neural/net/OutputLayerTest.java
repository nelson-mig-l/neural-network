package nelson.neural.net;

import nelson.neural.net.function.ActivationFunctionFactory;
import nelson.neural.net.util.Rng;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nelson on 11-Nov-18.
 */
public class OutputLayerTest {

    @Test
    public void s() {
        Rng.reset(0);
        final OutputLayer outputLayer = new OutputLayer(3, 1, ActivationFunctionFactory.linear());
        final List<Double> output = outputLayer.calculate(Arrays.asList(1.5, 1.2, 0.9));
        output.forEach(System.out::println);
    }
}
