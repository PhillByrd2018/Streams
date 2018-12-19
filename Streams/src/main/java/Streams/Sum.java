package Streams;

import java.lang.String;
import java.util.stream.IntStream;

import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * basic int stream with skip functionality
 */
public final class Sum {
    private Sum() {
    }

    /**
     * Runs through an int Stream and returns the sum of the stream
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Starting the Stream");

      IntStream
        .range(1, 16) //loops 1-15
        .skip(3) //skips the 1st 3 units in the range given
        .forEach(X -> System.out.println("Adding "+X+" to the total")); //for each element print them to he line

        System.out.println("The total is: " + 
        IntStream
        .range(1, 16) //loops 1-15
        .sum() + " of all the number in our stream!");

        System.out.println("Finished with the Stream");

    }
}