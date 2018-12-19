package Streams;

import java.lang.String;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * basic int stream
 */
public final class Ints {
    private Ints() {
    }

    /**
     * Runs through an int Stream
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
      IntStream
        .range(1, 10) //loops 1-9
        .forEach(System.out::println); //for each element print them
        System.out.println();

    }
}
