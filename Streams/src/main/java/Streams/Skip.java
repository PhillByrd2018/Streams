package Streams;

import java.lang.String;
import java.util.stream.IntStream;

/**
 * basic int stream with skip functionality
 */
public final class Skip {
    private Skip() {
    }

    /**
     * Runs through an int Stream using skip to jump over certain the first x #s
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Starting the Stream");

      IntStream
        .range(1, 16) //loops 1-15
        .skip(3) //skips the 1st 3 units in the range given
        .forEach(X -> System.out.println(X)); //for each element print them to he line

        System.out.println("Finished with the Stream");

    }
}
