package nelson.neural.net.util;

import java.util.Random;

public class Rng {

    private static Random r = new Random();

    public static double generate() {
        return r.nextDouble();
    }

    public static void reset() {
        r = new Random();
    }

    public static void reset(final int seed) {
        r = new Random(seed);
    }
}
