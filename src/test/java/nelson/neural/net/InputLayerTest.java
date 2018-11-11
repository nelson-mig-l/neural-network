package nelson.neural.net;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nelson on 10-Nov-18.
 */
public class InputLayerTest {

    @Test
    public void s() {
        final InputLayer inputLayer = new InputLayer(2);
        final List<Double> output = inputLayer.calculate(Arrays.asList(2.1, 1.5));
        output.forEach(System.out::println);
    }
}
