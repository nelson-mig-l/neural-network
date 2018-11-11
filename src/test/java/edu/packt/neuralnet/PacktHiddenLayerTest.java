package edu.packt.neuralnet;

import edu.packt.neuralnet.math.Sigmoid;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nelson on 11-Nov-18.
 */
public class PacktHiddenLayerTest {

    @Test
    public void s() {
        final HiddenLayer hiddenLayer = new HiddenLayer(3, new Sigmoid(1), 2);
        final List<Double> inputs = Arrays.asList(3.3, 0.5);
        hiddenLayer.setInputs(new ArrayList<>(inputs));
        hiddenLayer.calc();
        final ArrayList<Double> outputs = hiddenLayer.getOutputs();
        outputs.forEach(System.out::println);
    }
}
