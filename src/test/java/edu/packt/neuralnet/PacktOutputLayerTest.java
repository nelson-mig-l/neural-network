package edu.packt.neuralnet;

import edu.packt.neuralnet.math.Linear;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nelson on 11-Nov-18.
 */
public class PacktOutputLayerTest {

    @Test
    public void s() {
        final OutputLayer outputLayer = new OutputLayer(1, new Linear(1), 3);
        final List<Double> input = Arrays.asList(1.5, 1.2, 0.9);
        outputLayer.setInputs(new ArrayList<>(input));
        outputLayer.calc();
        final ArrayList<Double> outputs = outputLayer.getOutputs();
        outputs.forEach(System.out::println);
    }
}
