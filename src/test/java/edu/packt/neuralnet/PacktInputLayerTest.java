package edu.packt.neuralnet;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nelson on 10-Nov-18.
 */
public class PacktInputLayerTest {
    @Test
    public void s() {
        final InputLayer inputLayer = new InputLayer(2);
        inputLayer.init();
        final List<Double> ds = Arrays.asList(2.1, 1.5);
        inputLayer.setInputs(new ArrayList<>(ds));
        inputLayer.calc();
        final ArrayList<Double> outputs = inputLayer.getOutputs();
        outputs.forEach(System.out::println);
    }
}
