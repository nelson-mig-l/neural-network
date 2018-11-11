package nelson.neural.net.util;

import java.util.Random;

/**
 * Created by Nelson on 10-Nov-18.
 */
public class Rng {

    private static Random r = new Random();

    public static double generate() {
        final double v = r.nextDouble();
        System.err.println(v);
        return v;
    }

    public static void reset() {
        r = new Random();
    }

    public static void reset(final int seed) {
        r = new Random(seed);
    }
}
