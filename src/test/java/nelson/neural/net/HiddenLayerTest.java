package nelson.neural.net;

import nelson.neural.net.function.ActivationFunctionFactory;
import nelson.neural.net.util.Rng;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nelson on 11-Nov-18.
 */
public class HiddenLayerTest {
    @Test
    public void s() {
        Rng.reset(0);
        final HiddenLayer hiddenLayer = new HiddenLayer(3, 2, ActivationFunctionFactory.sigmoid());
        final List<Double> input = Arrays.asList(3.3, 0.5);
        final List<Double> output = hiddenLayer.calculate(input);
        output.forEach(System.out::println);
    }
}
