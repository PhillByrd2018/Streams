package Streams;

import java.lang.String;
import java.util.stream.Stream;

/**
 * basic string stream with sorting functionality
 */
public final class Sort {
    private Sort() {
    }

    /**
     * Runs through an string Stream using sort to return the first elements in the stream
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Starting the Stream");

        System.out.println("--------------------------------------");

        System.out.println("Stream before Sorting");

        Stream.of("Phill","Andrew","Toni","Matthew","Emily","Megan","Robert","Olivia")
            .forEach(x -> System.out.println(x));

        System.out.println("--------------------------------------");


        System.out.println("Sorted Stream's first element:");
        Stream.of("Phill","Andrew","Toni","Matthew","Emily","Megan","Robert","Olivia")
            .sorted()
            .findFirst()
            .ifPresent(System.out::println);

        System.out.println("--------------------------------------");

        System.out.println("Sorted Stream");
        Stream.of("Phill","Andrew","Toni","Matthew","Emily","Megan","Robert","Olivia")
            .sorted()
            .forEach(x -> System.out.println(x));

        System.out.println("Finished with the Stream");

    }
}